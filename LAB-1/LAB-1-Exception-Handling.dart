//Lab-1-Exercises-1


void throwError() {
  throw Exception('Something went wrong');
}

void main() {
  try {
    throwError();
  } catch (e) {
    print('Exception caught: $e');
  }
}

//Lab-1-Exercises-2
void divideNumbers(int a, int b) {
  try {
    if (b == 0) {
      throw DivideByZeroException();
    }
    print(a / b);
  } catch (e) {
    if (e is DivideByZeroException) {
      print('Cannot divide by zero');
    } else {
      print('An error occurred: $e');
    }
  }
}

void main() {
  divideNumbers(10, 2); // Output: 5.0
  divideNumbers(10, 0); // Output: Cannot divide by zero
}

//Lab-1-Exercises-3

void performOperation() {
  try {
    // Perform some operation that may throw an exception
    throw Exception('Something went wrong');
  } catch (e) {
    print('Exception caught: $e');
  } finally {
    print('Finally block executed');
  }
}

void main() {
  performOperation();
}