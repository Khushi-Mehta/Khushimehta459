import java.util.Scanner;
class series2//1+x+x2+x3+..+xn
{
    int n;
    int x;
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        System.out.println("Enter the value of x: ");
        x = sc.nextInt();
    }
    void compute()
    {
        double sum = 1;//double sum = 0
        for (int i=1; i<=n; i++)//for(int i=0; i<=n; i++)
        {
            sum = sum + Math.pow(x,i);
        }
        System.out.println("The sum of series is: "+sum);
    }
    public static void main()
    {
        series2 obj = new series2();
        obj.getData();
        obj.compute();
    }
}
        