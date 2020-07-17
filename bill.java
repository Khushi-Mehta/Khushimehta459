import java.util.Scanner;
class bill
{
    int usage;
    double bill;
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        int mins = 0;
        System.out.println("Enter the time of Internet usage(in mins): ");
        mins = sc.nextInt();
        usage = mins;
    }
    void compute()
    {
        if(usage>0 && usage<=60)
        bill = 20;
        else if(usage>60 && usage<=90)
        bill = 20+12;
        else if(usage>90 && usage<=105)
        bill = 20+12+8;
        else
        bill = ((usage-105)*2)+20+12+8;
    }
    void display()
    {
        System.out.println("Your bill comes out to be: "+bill);
    }
    public static void main()
    {
        bill obj = new bill();
        obj.accept();
        obj.compute();
        obj.display();
    }
}