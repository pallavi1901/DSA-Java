import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        for (int i = 0; i < num; i++) {
//            System.out.println("Hello world");
//        }
//
//        int count = 0;
//        while(count <= 5)
//        {
//            System.out.println("Hello World");
//            count++;
//        }
//
//        String name = "Pallavi";
//        System.out.println(name.charAt(0));
//
//       int n = 75460;
//       int rev = 0;
//       int rem;
//       while(n>0)
//       {
//           rem = n%10;
//           rev = rev*10+rem;
//           n = n/10;
//
//       }
//        System.out.println(rev);


        //Scanner in = new Scanner(System.in);


//        while (true)
//        {
//            System.out.println("Enter two number:");
//            int num1 = in.nextInt();
//            int num2 = in.nextInt();
//
//            System.out.println("Enter the operator:");
//            char op = in.next().trim().charAt(0);
//
////            switch (op) {
////                case '+' -> System.out.println(num1 + num2);
////                case '-' -> System.out.println(num1 - num2);
////                case '*' -> System.out.println(num1 * num2);
////                case '/' -> System.out.println(num1 / num2);
////                default -> System.out.println("Invalid operation");
////            }
//
//

        //}
//        Scanner in = new Scanner(System.in);
//        int day = in.nextInt();
//
//        switch (day) {
//            case 1, 2, 3, 4 -> System.out.println("Weekday");
//            case 5 -> System.out.println("Weekend");
//        }

        String message = myGreet("Pallavi");
        System.out.println(message);

    }

    static String myGreet(String name) {
        String message = "Hello "+name;
        return message;
      }
}
