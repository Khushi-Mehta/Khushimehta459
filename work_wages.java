class work_wages
{
    int R, H, W;
    void init(int r, int h)
    {
        R = r;
        H = h;
    }
    void calc()
    {
        if(H <= 35)
        {
            W = (H*R);
        }
        else if(H > 35 && H <= 60)
        {
            W = (35*R)+((H-35)*((15*100)/10));
        }
        else if(H > 60 && H<=70)
        {
            W = (35*R)+((25*R*15)/100)+((H-60)*2*R);
        }
        else
        {
            System.out.println("Work hour exceeds");
        }
    }
    void display()
    {
        System.out.println("The weekly wages of a person are : "+W);
    }
    public static void main()
    {
        work_wages obj = new work_wages();
        obj.init(60,45);
        obj.calc();
        obj.display();
    }
}