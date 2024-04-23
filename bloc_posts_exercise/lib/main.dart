import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';
import 'package:rxdart/rxdart.dart';

class Post {
  final int id;
  final String title;
  final String body;

  Post({required this.id, required this.title, required this.body});

  factory Post.fromJson(Map<String, dynamic> json) {
    return Post(
      id: json['id'],
      title: json['title'],
      body: json['body'],
    );
  }
}

class PostBloc {
  final _postsSubject = BehaviorSubject<List<Post>>();
  Stream<List<Post>> get postsStream => _postsSubject.stream;

  Future<void> fetchPosts() async {
    final response =
        await http.get(Uri.parse('https://jsonplaceholder.typicode.com/posts'));
    if (response.statusCode == 200) {
      final List<dynamic> responseData = json.decode(response.body);
      final posts = responseData.map((data) => Post.fromJson(data)).toList();
      _postsSubject.add(posts);
    } else {
      print('Failed to fetch posts. Error code: ${response.statusCode}');
    }
  }

  void dispose() {
    _postsSubject.close();
  }
}

class PostsScreen extends StatefulWidget {
  @override
  _PostsScreenState createState() => _PostsScreenState();
}

class _PostsScreenState extends State<PostsScreen> {
  final _postBloc = PostBloc();

  @override
  void initState() {
    super.initState();
    _postBloc.fetchPosts();
  }

  @override
  void dispose() {
    _postBloc.dispose();
    super.dispose();
  }

  Future<void> _refreshPosts() async {
    await _postBloc.fetchPosts();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Posts'),
        actions: [
          IconButton(
            icon: Icon(Icons.refresh),
            onPressed: _refreshPosts,
          ),
        ],
      ),
      body: StreamBuilder<List<Post>>(
        stream: _postBloc.postsStream,
        builder: (context, snapshot) {
          if (snapshot.hasData) {
            final posts = snapshot.data!;
            return RefreshIndicator(
              onRefresh: _refreshPosts,
              child: ListView.builder(
                itemCount: posts.length,
                itemBuilder: (context, index) {
                  final post = posts[index];
                  return ListTile(
                    title: Text(post.title),
                    subtitle: Text(post.body),
                  );
                },
              ),
            );
          } else if (snapshot.hasError) {
            return Center(
              child: Text('Failed to fetch posts.'),
            );
          } else {
            return Center(
              child: CircularProgressIndicator(),
            );
          }
        },
      ),
    );
  }
}

void main() {
  runApp(MaterialApp(
    home: PostsScreen(),
  ));
}
