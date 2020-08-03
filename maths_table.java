import java.util.Scanner;
class maths_table
{
    int num;
    int ans;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
    }
    void compute()
    {
        for(int i=1; i<=10; i++)
        {
            ans = num*i;
            System.out.println(num+ "*"+i+"="+ans);
            System.out.println();
        }
    }
    public static void main()
    {
        maths_table obj = new maths_table();
        obj.input();
        obj.compute();
    }
}