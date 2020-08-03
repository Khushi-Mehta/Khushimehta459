//start a program using the scanner class
import java.util.Scanner;
class sum_scanner
{
    int num1, num2;
    int sum;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("The first number is: ");
        num1 = sc.nextInt();
        System.out.println("The second number is: ");
        num2 = sc.nextInt();
    }
    void compute()
    {
        sum = num1+num2;
        System.out.println("The answer is: "+sum);
    }
    public static void main()
    {
        sum_scanner obj = new sum_scanner();
        obj.input();
        obj.compute();
    }
}