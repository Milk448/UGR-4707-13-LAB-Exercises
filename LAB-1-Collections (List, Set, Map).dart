//LAB-1-exercise -1
int findHighestNumber(List<int> numbers) {
  if (numbers.isEmpty) {
    throw Exception('List is empty');
  }

  int highest = numbers[0];
  for (int number in numbers) {
    if (number > highest) {
      highest = number;
    }
  }

  return highest;
}

void main() {
  List<int> numbers = [10, 5, 8, 3, 12, 7];
  int highestNumber = findHighestNumber(numbers);

  print('The highest number is: $highestNumber');
}



//LAB-1-exercise -2

void printMapKeysAndValues(Map<String, dynamic> map) {
  map.forEach((key, value) {
    print('Key: $key, Value: $value');
  });
}

void main() {
  Map<String, dynamic> map = {
    'name': 'John Doe',
    'age': 30,
    'city': 'New York',
    'country': 'USA',
  };

  printMapKeysAndValues(map);
}
//LAB-1-exercise -3

List<T> removeDuplicates<T>(List<T> list) {
  return List<T>.from(Set<T>.from(list));
}

void main() {
  List<int> numbers = [1, 2, 3, 4, 1, 3, 5, 2, 4];
  List<int> uniqueNumbers = removeDuplicates(numbers);

  print('List with duplicates: $numbers');
  print('List without duplicates: $uniqueNumbers');
}

