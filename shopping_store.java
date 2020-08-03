import java.util.Scanner;
class shopping_store
{
    double purchase_amt, dis;
    double net_amt;
    double additional_dis;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("YOUR PURCHASED AMOUNT IS: ");
        purchase_amt = sc.nextDouble();
    }
    void compute()
    {
        if(purchase_amt<= 5000)
        {
            dis = 400;
            System.out.println("Discount is: "+dis);
        }
        else if(purchase_amt > 5000 && purchase_amt <=10000)
        {
            dis = 800;
            System.out.println("Discount is: "+dis);
        }
        else if(purchase_amt > 10000 && purchase_amt <=20000)
        {
            dis = 1000;
            System.out.println("Discount is: "+dis);
        }
        else 
        {
            dis = 2000;
            System.out.println("Discount is: "+dis);
        }
        net_amt = purchase_amt - dis;
        System.out.println("Net amount is: "+net_amt);
        if(purchase_amt >20000)
        {
            additional_dis = (net_amt*3)/100;
            net_amt = net_amt - additional_dis;
        }
    }
    public static void main()
    {
        shopping_store obj = new shopping_store();
        obj.input();
        obj.compute();
    }
}
            