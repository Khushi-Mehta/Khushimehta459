import java.util.Scanner;
class tax
{
    String name;
    int income;
    double tax;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee Name : ");
        name = sc.nextLine();
        System.out.println("Employee income : ");
        income = sc.nextInt();
    }
    void calc()
    {
        if(income<=40000)
        {
            System.out.println("Tax : Nil");
        }
        else if(income>40000 && income<70000)
        {
            tax = (20*income)/100;
            System.out.println("Tax : "+tax);
        }
        else if(income>70000 && income<100000)
        {
            tax = (30*income)/100;
            System.out.println("Tax : "+tax);
        }
        else
        {
            tax = (40*income)/100;
            System.out.println("Tax : "+tax);
        }
    }
    public static void main()
    {
        tax obj = new tax();
        obj.input();
        obj.calc();
    }
}