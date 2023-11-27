import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ex10(3);
    }
    public static void ex1(Scanner scan)
    {
        double avg = 0;
        int num = 0;
        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println("Enter new grade: ");
            num = scan.nextInt();
            avg+=num;
        }
        System.out.println("avg = " + avg/5.0);
    }
    public static void ex2(Scanner scan)
    {
        String num = "";
        System.out.println("Enter string: ");
        num = scan.next();
        int sum = 0;
        while (!num.equals("enter"))
        {
            sum++;
            System.out.println("Enter string: ");
            num = scan.next();
        }
        System.out.println("sum = " + sum);
    }
    public static void ex3(Scanner scan ,String num)
    {
        int tries = 0;
        String newS = "";
        do {
            System.out.println("Enter credit num: ");
            newS = scan.next();
            tries++;
        }while(!newS.equals(num) && tries != 3);
        if(newS.equals(num))
        {
            System.out.println("How much money");
        }
        else
        {
            System.out.println("Error");
        }


    }
    public static void ex4(String s) {
        String s2 = s;
        int strLength = s.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            s2 = s2 + s.charAt(i);
        }

        if (s.toLowerCase().equals(s2.toLowerCase())) {
            System.out.println(s + " is a Palindrome String.");
        } else {
            System.out.println(s + " is not a Palindrome String.");
        }
    }
    public static void ex5(int n)
    {
        for(int i = 1 ; i <= n ; i++ )
        {
            if(n% i == 0 && n!= i)
            {
                System.out.print(i + ",");
            }
            else if (n== i)
            {
                System.out.print(i);
            }
        }
    }
    public static void ex6()
    {
        for(int i = 1 ; i <= 10 ; i++)
        {
            for(int j = 1 ; j <= 10 ; j++)
            {
                System.out.print(i*j + " | ");
            }
            System.out.println("");
        }
    }
    public static void ex7(Scanner scan)
    {
        int min = 0 ;
        int max = 0;
        int grade = 0;
        for(int i = 0 ; i < 7 ; i++)
        {
            System.out.println("Enter grade: ");
            grade = scan.nextInt();
            if(grade > max)
            {
                max = grade;
            }
            if(grade < min)
            {
                min = grade;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
    public static boolean ex8(int num)
    {
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        int temp = 0;
        while(num1 != num && num2 != num && num>num3)
        {
            temp = num2;
            num2 = num3;
            num1 = temp;
            num3 = num2 + num1;


        }
        if(num3 == num)
        {
            return true;
        }
        return false;
    }
    public static void ex9(int n1, int n2)
    {
        int sum = 0;
        for(int i = 1 ; i <= n1 ; i++)
        {
            sum+=n2;
        }
        System.out.println("sum = " + sum);
    }
    public static void ex10(int num)
    {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
