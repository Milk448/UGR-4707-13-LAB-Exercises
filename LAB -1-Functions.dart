//Lab-1 exercise-1 
double calculateAverage(List<double> numbers) {
  if (numbers.isEmpty) {
    throw Exception('List is empty');
  }

  double sum = 0;
  for (double number in numbers) {
    sum += number;
  }

  return sum / numbers.length;
}

void main() {
  List<double> numbers = [2.5, 4.8, 6.3, 9.1, 1.7];
  double average = calculateAverage(numbers);
  
  print('The average is: $average');
}




//Lab-1 exercise-2


double calculateAverage(List<double> numbers) {
  if (numbers.isEmpty) {
    throw Exception('List is empty');
  }

  double sum = 0;
  for (double number in numbers) {
    sum += number;
  }

  return sum / numbers.length;
}

void main() {
  List<double> numbers = [1.2, 3.4, 5.6, 7.8, 9.0];
  double average = calculateAverage(numbers);
  
  print('The average is: $average');
}




