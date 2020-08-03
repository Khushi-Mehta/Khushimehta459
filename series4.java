import java.util.Scanner;
class series4
{
    int x;
    int n;
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
        double sum = 0;
        int ans = 1;
        for (int i = 1; i<=n; i++)
        {
            ans = ans * i;
            sum = sum + ((Math.pow(x,i))/ans);
        }
        System.out.println("Sum of series: "+sum);
    }
    public static void main()
    {
        series4 obj = new series4();
        obj.getData();
        obj.compute();
    }
}
        
        