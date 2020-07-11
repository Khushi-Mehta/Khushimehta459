class resistance1
{
    double r1, r2;
    char ch;
    void init(double r, double R,char c)
    {
        r1 = r;
        r2 = R;
        ch = c;
    }
    void calc()
    {
        if(ch == 's'|| ch =='S')
        {
            System.out.println("Resistance(in series): "+ (r1+r2));
        }
        else if(ch=='p'||ch=='P')
        {
            System.out.println("Resistance(in parallel): "+((r1*r2)/(r1+r2)));
        }
        else
        {
            System.out.println("INVALID");
        }
    }
    public static void main()
    {
        resistance1 obj = new resistance1();
        obj.init(12.4,14.2,'p');
        obj.calc();
    }
}
        