/**
 * Created by alyona on 10/5/2015.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*1. Factorial n, where n is entered from the keyboard by user.*/

        //неправильная формула - факториал, например 5 - 10, тут же выводится 120. И чисел выводит 6,
        // хотя по идее факториал высчитывается в n-2 проходов цикла
//        int a = 1;
//        int b = 1;
//        System.out.println("Input number"); // input n for factorial
//        Scanner readN = new Scanner(System.in);
//        int Number = readN.nextInt();
//        for (int i = 0; i < Number; i++ ) {
//            System.out.println(a);
//            a = a * b;
//            b++;
//        }



       /*+2. Find the number closest to 10, out of the numbers in m and n variables.

        System.out.println("Input number m");
        Scanner readM = new Scanner(System.in);
        int m = readM.nextInt();
        System.out.println("Input number n");
        Scanner readN = new Scanner(System.in);
        int n = readN.nextInt();
        int Temp1 = 0;
        int Temp2 = 0;

        //не стоит записывать циклы в одну строку - чаще всего пишут так, как показано на примерах на лекциях - гораздо проще читать и понимать

        if (m < 10) {Temp1 = 10 - m;} else if (m == 10) {Temp1 = 0;} else if (m > 10) {Temp1 = m - 10;} // find how close to 10 is m
        if (n < 10) {Temp2 = 10 - n;} else if (n == 10) {Temp2 = 0;} else if (n > 10) {Temp2 = n - 10;} // find how close to 10 is n
        if (Temp1 < Temp2) {System.out.println(m+" is closer to 10");} else if (Temp1 == Temp2) // compare what number is closer to 10
        {System.out.println("m and n are equally close to 10");} else if (Temp1 > Temp2)
        {System.out.println(n+" is closer to 10");}
        */


        /* 3. Variables a, b & c have real numbers assigned. Find the roots of the quadratic equation ax�+bx+c=0.
        Or return "No roots" if there are none.


        System.out.println("Input number a");
        Scanner readA = new Scanner(System.in);
        double a = readA.nextDouble();

        System.out.println("Input number b");
        Scanner readB = new Scanner(System.in);
        double b = readB.nextDouble();

        System.out.println("Input number c");
        Scanner readC = new Scanner(System.in);
        double c = readC.nextDouble();

        double D = Math.pow(b, 2) - 4*a*c; // find Discriminant
        if (D > 0) {  // 2 roots
            double x1 = (-b + Math.sqrt(D))/2*a;
            double x2 = (-b - Math.sqrt(D))/2*a;

            System.out.println("2 roots: x1 = "+x1+" and x2 = "+x2);

        }
        else if (D == 0) {  // 1 root
            double x3 = -b/2*a;
            System.out.println("1 root: x = "+x3);

        }
        else if (D < 0) {System.out.println("No roots");}  // no roots
        */



        /* +4. Find the sum of all digits in the number entered from the keyboard.

        System.out.println("Input number"); // input number for a
        Scanner readN = new Scanner(System.in);
        int Number = readN.nextInt();
        int a = 0;
        while (Number > 0) {  // find the sum of digits
            a += Number%10;
            Number = Number/10;
        }
        System.out.println(a);
         */





        /* +5. Tram tickets with numbers from 000001 to 999999. Find the number of lucky tickets, where sum of first
        3 digits equals to the sum of last 3 digits.


        int LuckyTicket = 0;
        for (int i = 000001; i <= 999999; i++)
        {
            int TempNumber = i; // number of the ticket, is equal to iteration
            int Sum1 = 0;
            int Sum2 = 0;
            for (int j = 0; j < 3; j++)  // find the sum of last 3 digits
            {
                Sum1 += TempNumber%10;
                TempNumber = TempNumber/10;
            }
            for (int k = 0; k < 3; k++) // find the sum of first 3 digits
            {
                Sum2 += TempNumber%10;
                TempNumber = TempNumber/10;
            }
            if (Sum1 == Sum2) // compare sums and increment lucky tickets number
            {
                LuckyTicket++;
            }

        }
        System.out.println(LuckyTicket);
         */


    }
}
