// import java.util.Scanner;

// public class que1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.print("The sum is: " + sum);
//     }
// }

// import java.util.*;

// public class que1{
// public static void main(String[] args){
// Scanner sc = new Scanner (System.in);
// System.out.print("Enter two numbers: ");
// int a = sc.nextInt();
// int b = sc.nextInt();
// int sum = a + b;
// System.out.print("The sum is: " + sum);
// }
// }

public class que1 {
    int id;
    String name;

    public que1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        que1 s1 = new que1(1, "John");
        // que1 s2=new que1(2,"Jane");
        System.out.println(s1);
        // System.out.println("\nStudent 2: ID - "+s2.id +", Name - "+s2.name);
    }
}
