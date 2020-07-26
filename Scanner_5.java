import java.util.Scanner;
class Scanner_5
{
    int num1;
    int num2;
    double avg;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
    }
    void display()
    {
        avg = ((num1+num2)/2);
        System.out.println("Average marks : "+ avg);
    }
    public static void main()
    {
        Scanner_5 obj = new Scanner_5();
        obj.input();
        obj.display();
    }
}