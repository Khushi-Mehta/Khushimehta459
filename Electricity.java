class Electricity
{
    double bill;
    int units;
    void accept(int u)
    {
        units = u;
    }
    void compute()
    {
        if(units>0 && units<=100)
        {
            bill = (units*40)/100 + 500;
        }
        else if(units>100 && units<=300)
        {
            bill = ((units-100)*60)/100 + (40*100)/100 + 500;
        }
        else
        {
            bill = (40*100)/100 + (200*60)/100 + ((units - 300)*1) + 500;
        }
    }
    void print_the_bill()
    {
        System.out.println("Dear customer, your electricity bill is: "+bill);
    }
    public static void main()
    {
        Electricity obj = new Electricity();
        obj.accept(320);
        obj.compute();
        obj.print_the_bill();
    }
}

