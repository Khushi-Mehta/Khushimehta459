import java.util.Scanner;//the scanner class is imported from java.util package 
//scanner is library (pre-defined) class
class Scanner_8//class name
{
    int u,t,a;
    double disp;//instance variable
    void input()//non-parameterized method, formal parameters
    {
        Scanner sc = new Scanner(System.in);//new operator is used to create object here sc
        System.out.println("Enter distance : ");
        u = sc.nextInt();
        System.out.println("Enter time(sec): ");
        t = sc.nextInt();
        System.out.println("Enter acceleration : ");
        a = sc.nextInt();
    }
    void calc()//method to calculate
    {
        disp = (u*t)+(a*(Math.pow(t,2))/2);
    }
    void display()
    {
        System.out.println("The displacement is : "+disp);
    }
    public static void main()//main method 
    {
        Scanner_8 obj = new Scanner_8();
        obj.input();
        obj.calc();
        obj.display();
    }
}
/** Name : Khushi 
 *  Start date : 27th July
 *  End date : 27th July 
 *  End time : 00:15 a.m.
 */