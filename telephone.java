import java.util.Scanner;//scanner class, package is imported from java.util library
class telephone//class name is telephone
{
    int no_of_calls;
    double bill;//instance variables
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dear customer, enter the no. of calls : ");
        no_of_calls = sc.nextInt();//no. of calls will be entered by the user
    }
    void calc()
    {
        if(no_of_calls <= 100)//if else if ladder 
        {
            bill = 100;
            System.out.println("Telephonic bill: "+no_of_calls);
        }
        else if(no_of_calls >100 && no_of_calls > 150)
        {
            bill = 100 + ((no_of_calls - 100)*2);
            System.out.println("Telephonic bill: "+no_of_calls);
        }
        else 
        {
            bill = 100 + (50*2) + ((no_of_calls - 150)*2.50);
            System.out.println("Telephonic bill: "+no_of_calls);
        }
    }
    public static void main()//main method 
    {
        telephone obj = new telephone();
        obj.input();
        obj.calc();//method invocation
    }
}
 
/** Author : Khushi Mehta
 *  Version of Java : 2.1.2
 *  Start date/ time : 29th July, 12:58 a.m.
 *  End date/ time : 29th July, 1:06 a.m.
 */           