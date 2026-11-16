public class Santh {
    public static void main (String[] args){
//         //Arithmetic Operators 
//         int age = 23;
//         float years = 34;
//         System.out.println("Addition : "+(age+years));
//         System.out.println("Subtraction : "+(age-years));
//         if(age>0 && years>0){
//             System.out.println("Multiplication : "+(age*years));

//         }else{
//             System.out.println("Multiplication : 0");
//         }
//     }
// }

// Save this file as BasicOperators.java
// public class BasicOperators {
//     public static void main(String[] args) {
//         int a = 10, b = 5;

// // Arithmetic Operators
//         System.out.println("a + b = " + (a + b));
//         System.out.println("a - b = " + (a - b));
//         System.out.println("a * b = " + (a * b));
//         System.out.println("a / b = " + (a / b));

// // Relational Operators
//         System.out.println("a > b : " + (a > b));
//         System.out.println("a < b : " + (a < b));
//         System.out.println("a == b : " + (a == b));

// // Logical Operators
//         boolean x = true, y = false;
//         System.out.println("x && y : " + (x && y));
//         System.out.println("x || y : " + (x || y));
//         System.out.println("!x     : " + (!x));

       
//     }
// }

// public class LogicalOperatorExample {
//         public static void main(String[] args) {
//                 int a = 10;
//                 int b = 20;
                
//                 System.out.println("AND (&&); " + (a > 5 && b < 15));
//                 System.out.println("OR (||); " + (a > 15 || b > 15));
//                 System.out.println("NOT (!); " + !(a > 5));
//         }
// }

// public class BitwiseOperatorExample {
//         public static void main(String[] args) {
//         int a = 5;
//         int b = 3;
//         System.out.println("Bitwise AND: " + (a & b));
//         System.out.println("Bitwise OR: " + (a | b));
//         System.out.println("Bitwise XOR: " + (a ^ b));
//         System.out.println("Bitwise NOT of a: " + (~a));

//         }
// }

// public class ForLoopExample {
//     public static void main(String[] args) {
//         // Print numbers from 1 to 10
//         for (int i = 1; i <= 50; i++) {
//             System.out.println("Number: " + i);
//         }
//     }
// }





// import java.util.Scanner; 
 
// public class Main 
// { 
//     public static void main(String[] args) 
//     { 
//         Scanner sc = new Scanner(System.in); 
 
//         int[] arr = new int[5]; 
 
//         System.out.println("Enter 5 numbers:"); 
 
//         for(int i=0;i<arr.length;i++) 
//         { 
//             arr[i] = sc.nextInt(); 
//         } 
 
//         System.out.println("Array Elements:");
//          for(int num : arr) 
//         { 
//             System.out.println(num); 
//         } 
//     } 
// }

// import java.util.*;
// class MergeArrays {
//     public static void main(String[] args) {
//         int[] a = {1,3,5};
//         int[] b = {2,4,6};
//         int[] c = new int[a.length + b.length];
//         int i=0,j=0,k=0;
//         while(i<a.length && j<b.length){
//             if(a[i] < b[j]) c[k++] = a[i++];
//             else c[k++] = b[j++];
//         }
//         while(i<a.length) c[k++] = a[i++];
//         while(j<b.length) c[k++] = b[j++];
//         System.out.println(Arrays.toString(c));
//     }
// }


int a = 045;
System.out.println(a);
    }
}