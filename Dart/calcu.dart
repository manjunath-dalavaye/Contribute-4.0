import 'dart:io';

void main() {
  // Input first number
  print('Enter the first number:');
  double num1 = double.parse(stdin.readLineSync()!);

  // Input second number
  print('Enter the second number:');
  double num2 = double.parse(stdin.readLineSync()!);

  // Perform calculations
  double sum = num1 + num2;
  double difference = num1 - num2;
  double product = num1 * num2;
  double quotient = num1 / num2;

  // Output results
  print('Sum: $sum');
  print('Difference: $difference');
  print('Product: $product');
  print('Quotient: $quotient');
}
