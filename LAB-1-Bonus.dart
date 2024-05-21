
//Lab-1-
//Bonus
import 'dart:async';
import 'dart:io';

import 'package:http/http.dart' as http;

class FileDownloader {
  Future<void> downloadFiles(List<String> urls) async {
    final List<Future<void>> downloadFutures = [];

    for (var i = 0; i < urls.length; i++) {
      final url = urls[i];
      final fileName = 'file_$i.txt';
      final downloadFuture = _downloadFile(url, fileName);
      downloadFutures.add(downloadFuture);
    }

    await Future.wait(downloadFutures);
    print('All files downloaded!');
  }

  Future<void> _downloadFile(String url, String fileName) async {
    final response = await http.get(Uri.parse(url));
    final file = File(fileName);

    await file.writeAsBytes(response.bodyBytes);
    print('Downloaded: $fileName');
  }
}

void main() {
  final downloader = FileDownloader();
  final urls = [
    'https://example.com/file1.txt',
    'https://example.com/file2.txt',
    'https://example.com/file3.txt',
  ];

  downloader.downloadFiles(urls).catchError((error) {
    print('Error occurred: $error');
  });
}