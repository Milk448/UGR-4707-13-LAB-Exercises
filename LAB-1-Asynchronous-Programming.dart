
//Lab-1-Exercise-2 
Future<int> fetchNumber() {
  return Future.delayed(Duration(seconds: 2), () => 42);
}

Future<void> main() async {
  print('Fetching number...');
  int number = await fetchNumber();
  print('Number: $number');
  print('Task completed');
}


//Lab-1-Exercise-3

Future<int> fetchNumber() {
  return Future.delayed(Duration(seconds: 2), () => 42);
}

void main() {
  print('Fetching number...');
  fetchNumber().then((number) {
    print('Number: $number');
    print('Task completed');
  });
}



