class Employeee
{
    double basic,dearness,houserent,fund,net,gross;
    Employeee(double b)
    {
        basic = b;
    }
    void allow1()
    {
        dearness = (25*basic)/100.0;
    }
    void allow2()
    {
        houserent = (15*basic)/100.0;
    }
    void profund()
    {
        fund = (8.33*basic)/100.0;
    }
    void NetPay()
    {
        net = basic + dearness + houserent;
    }
    void grossPay()
    {
        gross = net - fund;
        System.out.println("The gross pay is "+gross);
    }
    public static void main()
    {
        Employeee obj = new Employeee(50000);
        obj.allow1();
        obj.allow2();
        obj.profund();
        obj.NetPay();
        obj.grossPay();
    }
}
    
    