class employee
{
    int pan;
    String name;
    double tax, taxincome;
    employee()//default constructor
    {
        String name = "Khushi";
        tax = 0;
        taxincome = 0;
    }
    void input(int p,String n,double ti)
    {
        pan = p;
        name = n;
        taxincome = ti;
    }
    void calc()
    {
        if(taxincome<=100000)
        {
            tax = 0.0;
        }
        else if(taxincome<=100001 && taxincome>=150000)
        {
            tax = (10*(taxincome-100000))/100.0;
        }
        else if(taxincome<=150001 && taxincome>=250000)
        {
            tax = 5000 +((20*(taxincome-150000))/100.0);
        }
        else
        {
            tax = 25000 + ((30*(taxincome-250000))/100.0);
        }
    }
    void display()
    {
        System.out.println("Pan number\t Name\t Taxincome\t Tax");
        System.out.println(pan+"     \t"+name+" \t"+taxincome+"\t"+tax);
    }
    public static void main()
    {
        employee obj = new employee();
        obj.input(1718,"Khushi",300000);
        obj.calc();
        obj.display();
    }
}

        
        
        