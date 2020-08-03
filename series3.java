import java.util.Scanner;
class series3
{
    int n;//the number of which factorial is to be found
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
    }
    void compute()
    {
        int ans = 1;
        for (int i = 1; i<=n; i++)
        {
            ans = ans * i;
        }
        System.out.println("Factorial of a number ("+n+"!)"+" is : "+ans);
    }
    public static void main()
    {
        series3 obj = new series3();
        obj.getData();
        obj.compute();
    }
}

        
        