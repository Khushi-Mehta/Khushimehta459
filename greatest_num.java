import java.util.Scanner;
class greatest_num
{
    int num1,num2, num3;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num: ");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd num: ");
        num2 = sc.nextInt();
        System.out.println("Enter 3rd num: ");
        num3 = sc.nextInt();
    }
    void compute()
    {
        if(num1> num2 && num1> num3)
        System.out.println("The greatest num is; "+num1);
        else if(num2>num3 && num2>num1)
        System.out.println("The greatest num is: "+num2);
        else if(num3>num1 && num3>num1)
        System.out.println("The grestest num is: "+num3);
    }
    public static void main()
    {
        greatest_num obj= new greatest_num();
        obj.input();
        obj.compute();
    }
}