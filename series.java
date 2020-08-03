import java.util.Scanner;//scanner class 
class series//class name
{//series : 1+2+3+...+n
    int n;//instance variables 
    void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the series : ");
        n = sc.nextInt();//user will enter a number
    }
    void computeSum()
    {
        int sum = 0;
        for(int i = 1; i<=n; i++)//for loop
        {//initialisation, condition or expression , updation takes place
           sum = sum + i;
        }
        System.out.println("The sum of the series : "+sum);
    }
    public static void main()//main method
    {
        series obj = new series();
        obj.getData();
        obj.computeSum();
    }
}   
//end the program