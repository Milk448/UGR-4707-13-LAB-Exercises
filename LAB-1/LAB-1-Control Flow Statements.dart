//exercise-1 
void main() {
  int day = 3; // Assuming the input is 3
  
  switch (day) {
    case 1:
      print('Monday');
      break;
    case 2:
      print('Tuesday');
      break;
    case 3:
      print('Wednesday');
      break;
    case 4:
      print('Thursday');
      break;
    case 5:
      print('Friday');
      break;
    case 6:
      print('Saturday');
      break;
    case 7:
      print('Sunday');
      break;
    default:
      print('Invalid day');
  }
}


//exercise-2


void main() {
  int n = 10; // The number of Fibonacci numbers to print
  int first = 0;
  int second = 1;

  print(first); // Print the first Fibonacci number
  print(second); // Print the second Fibonacci number

  for (int i = 3; i <= n; i++) {
    int next = first + second;
    print(next); // Print the next Fibonacci number
    first = second;
    second = next;
  }
}
