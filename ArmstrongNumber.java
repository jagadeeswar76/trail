// public class Main {
//     public static void main(String[] args) {
//         long product = 1;
//         for (int i = 1; i <= 15; i++) {
// //             product *= i;
// //         }
// //         System.out.println("Product = " + product);
// //     }
// // }


// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if (age >= 0 && age <= 10) {
//             System.out.println("Child");
//         } else if (age > 10 && age <= 25) {
//             System.out.println("Adult");
//         } else if (age > 25 && age <= 100) {
//             System.out.println("Old");
//         } else {
//             System.out.println("Invalid age");
//         }
//     }
// }


// public class Pattern1 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Pattern2 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Pattern3 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = i; j < n; j++) System.out.print(" ");
//             for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
//             System.out.println();
//         }
//     }
// }


// public class Pattern4 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = n; i >= 1; i--) {
//             for (int j = i; j < n; j++) System.out.print(" ");
//             for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
//             System.out.println();
//         }
//     }
// }

// public class Pattern5 {
//     public static void main(String[] args) {
//         int n = 5;
//         // Upper half
//         for (int i = 1; i <= n; i++) {
//             for (int j = i; j < n; j++) System.out.print(" ");
//             for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
//             System.out.println();
//         }
//         // Lower half
//         for (int i = n - 1; i >= 1; i--) {
//             for (int j = n; j > i; j--) System.out.print(" ");
//             for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
//             System.out.println();
//         }
//     }
// }


// public class Pattern6 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (i == 1 || i == n || j == 1 || j == n)
//                     System.out.print("* ");
//                 else
//                     System.out.print("  ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class Pattern7 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j < i; j++) System.out.print("  ");
//             for (int k = i; k <= n; k++) System.out.print("* ");
//             System.out.println();
//         }
//     }
// }



// public class Pattern8 {
//     public static void main(String[] args) {
//         int rows = 4, cols = 7;
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= cols; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         } } }


// public class Pattern9 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.Scanner;

// public class PrimeCheck {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         boolean isPrime = true;

//         if (num <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i <= num / 2; i++) {
//                 if (num % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }

//         if (isPrime) {
//             System.out.println(num + " is a Prime number.");
//         } else {
//             System.out.println(num + " is NOT a Prime number.");
//         }

//         sc.close();
//     }
// }



// import java.util.Scanner;

// public class Fibonacciseries {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of terms: ");
//         int n = sc.nextInt();

//         int first = 0, second = 1;

//         System.out.println("Fibonacci Series:");
//         for (int i = 1; i <= n; i++) {
//             System.out.print(first + " ");
//             int next = first + second;
//             first = second;
//             second = next;
//         }

//         sc.close();
//     }
// }


// import java.util.Scanner;

// public class BuzzNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         if (num % 7 == 0 || num % 10 == 7) {
//             System.out.println(num + " is a Buzz Number!");
//         } else {
//             System.out.println(num + " is NOT a Buzz Number.");
//         }

//         sc.close();
//     }
// }


// import java.util.Scanner;

// public class ArmstrongNumber {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

//         int originalNumber = number;
//         int copy = number;
//         int digitCount = 0;
//         int result = 0;

//         // Step 1: Count the number of digits
//         while (copy != 0) {
//             digitCount++;
//             copy = copy / 10;
//         }

//         // Reset copy to the original number
//         copy = number;

//         // Step 2: Calculate the Armstrong sum
//         while (copy != 0) {

//             int lastDigit = copy % 10;

//             result = result + (int) Math.pow(lastDigit, digitCount);

//             copy = copy / 10;
//         }

//         // Step 3: Compare the result with the original number
//         if (result == originalNumber) {
//             System.out.println(originalNumber + " is an Armstrong Number");
//         } else {
//             System.out.println(originalNumber + " is not an Armstrong Number");
//         }

//         sc.close();
//     }
// }

