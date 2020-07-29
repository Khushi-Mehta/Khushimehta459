import java.util.Scanner;
class Scanner_9
{
    int a, sqr, cube;
    double sqroot,cbroot;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have entered : ");
        a = sc.nextInt();
    }
    void calc()
    {
        sqr = a*a;
        cube = a*a*a;
        sqroot = Math.sqrt(a);
        cbroot = Math.cbrt (a);
    }
    void display()
    {
        System.out.println("The square of a no. is : "+sqr);
        System.out.println("The cube of a no. is : "+cube);
        System.out.println("The square root of a no. is : "+sqroot);
        System.out.println("The cube root of a no. is : "+cbroot);
    }
    public static void main()
    {
        Scanner_9 obj = new Scanner_9();
        obj.input();
        obj.calc();
        obj.display();
    }
}