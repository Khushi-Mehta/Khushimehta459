class quadratic 
{
    int a;//coefficient of x2
    int b;//coefficient of x
    int c;//constant
    int D;//Discriminant
    void accept(int num1, int num2, int num3)
    {
        a =  num1;
        b = num2;
        c = num3;
    }
    void compute()
    {
        D = b*b-(4*a*c);
        if(D==0)
        {
        System.out.println("Real and equal roots");
        System.out.println("Root1: "+(-b/(2*a))+" Root2: "+(b/(2*a)));
        }
        else if(D>0)
        {
        System.out.println("Real and unequal roots");
        System.out.println("Root1: "+((-b+D)/(2*a))+" Root2: "+((-b-D)/(2*a)));
        }
        else
        {
        System.out.println("Imaginary roots");
        }
    }
    public static void main()
    {
        quadratic obj = new quadratic();
        obj.accept(3,6,3);
        obj.compute();
    }
}
        
        