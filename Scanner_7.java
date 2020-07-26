import java.util.Scanner;
class Scanner_7
{
    int h,m,s;
    int sec;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time(hrs) to be converted to sec:");
        h = sc.nextInt();
        System.out.println("Enter time(mins) to be converted to sec:");
        m = sc.nextInt();
        System.out.println("Enter time(secs) to be converted to sec:");
        s = sc.nextInt();
    }
    void calc()
    {
        sec = (h*3600)+(m*60)+s;
    }
    void display()
    {
        System.out.println("Time in sec : "+sec);
    }
    public static void main()
    {
        Scanner_7 obj = new Scanner_7();
        obj.input();
        obj.calc();
        obj.display();
    }
}