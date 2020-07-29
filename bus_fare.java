import java.util.Scanner;
class bus_fare
{
    int km;
    double fare;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kms: ");
        km = sc.nextInt();
    }
    void calc()
    {
        if (km <= 1)
        {
            fare = 4;
            System.out.println("Bus fare : "+fare);
        }
        else if(km>1 && km<5)
        {
            fare = 4 + ((km - 1)*4);
            System.out.println("Bus fare : "+fare);
        }
        else if(km>5 && km<14)
        {
            fare = 4 + (4*4) + ((km-5)*6);
            System.out.println("Bus fare : "+fare);
        }
        else 
        {
            fare = 4 + (4*4) + (10*6)+((km-14)*8);
            System.out.println("Bus fare : "+fare);
        }
    }
    public static void main()
    {
        bus_fare obj = new bus_fare();
        obj.input();
        obj.calc();
    }
}

            
        
        