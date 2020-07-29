import java.util.Scanner;
class feet_inch
{
    double feet;
    double convert;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in feet :  ");
        feet = sc.nextDouble();
    }
    void calc()
    {
        convert = feet*12;
    }
    void display()
    {
        System.out.println("The distance in feet is : "+feet);
        System.out.println("Distance converted in inches : "+convert);
    }
    public static void main()
    {
        feet_inch obj = new feet_inch();
        obj.input();
        obj.calc();
        obj.display();
    }
}
        
    