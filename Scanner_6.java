import java.util.Scanner;
class Scanner_6
{
    int r;
    int t;
    double p;
    double SI;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rate: ");
        r = sc.nextInt();
        System.out.println("Enter time(in yrs): ");
        t = sc.nextInt();
        System.out.println("Enter principal: ");
        p = sc.nextDouble();
    }
    void calc()
    {
        SI = (p*r*t)/100;
    }
    void display()
    {
        System.out.println("Simple Interest is : "+SI);
    }
    public static void main()
    {
        Scanner_6 obj = new Scanner_6();
        obj.input();
        obj.calc();
        obj.display();
    }
}
        