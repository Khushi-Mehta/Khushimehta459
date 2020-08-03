import java.util.Scanner;
class series5
{
    int n;
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
    }
    void compute()
    {
        double sum = 0;
        for(int i=0; i<=n; i++)
        {
            sum = sum + 1/(Math.pow(2,i));
        }
        System.out.println("The sum of the series is: "+sum); 
    }
    public static void main()
    {
        series5 obj = new series5();
        obj.getData();
        obj.compute();
    }
}