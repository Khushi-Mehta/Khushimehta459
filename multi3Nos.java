class multi3Nos
{
    int num1, num3;
    double num2,ans;
    void init(int a,double b,int c)
    {
        num1 = a;
        num2 = b;
        num3 = c;
    }
    void calc()
    {
        ans = (num1*num2*num3);
    }
    void display()
    {
        System.out.println("The ans is "+ans);
    }
    public static void main()//main method
    {
        multi3Nos obj = new multi3Nos();
        int x,z;
        double y;
        x = 7;
        y = 2.4;
        z = 11;
        obj.init(x,y,z);
        obj.calc();
        obj.display();
    }
}