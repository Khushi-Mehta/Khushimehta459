import java.util.Scanner;
class series6
{
    int a,n;
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a = sc.nextInt();
        System.out.println("Enter the value of n : ");
        n = sc.nextInt();
    }
    void compute()
    {
        double sum = 0;
        for(int i = 0; i<=n; i++)
        {
            if(i%2 == 0)
            {
                sum = sum + Math.pow(a,i);
            }
            else
            {
                sum = sum + Math.pow(a,i);
            }
        }
        System.out.println("The sum of series is: "+sum);
    }
    public static void main()
    {
        series6 obj = new series6();
        obj.getData();
        obj.compute();
    }
}