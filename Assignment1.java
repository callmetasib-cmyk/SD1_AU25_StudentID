
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Hello, World!");

       
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

       
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Max is: " + max);

        
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.print("Choose + - * / : ");
        char op = sc.next().charAt(0);
        if (op == '+') System.out.println(x + y);
        else if (op == '-') System.out.println(x - y);
        else if (op == '*') System.out.println(x * y);
        else if (op == '/') System.out.println(x / y);

        
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++)
            System.out.print(i + " ");
        System.out.println();

       
        System.out.print("Enter number: ");
        int table = sc.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.println(table + " x " + i + " = " + (table * i));

       
        System.out.print("Enter number: ");
        int f = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= f; i++)
            fact *= i;
        System.out.println("Factorial: " + fact);

        
        System.out.print("Enter N: ");
        int sumN = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= sumN; i++)
            sum += i;
        System.out.println("Sum: " + sum);

        sc.close();
    }
}