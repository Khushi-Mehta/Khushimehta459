class extra6
{
    int n1,ans;
    void init(int num1)
    {
        n1=num1;
    }
    void calc()
    {
        ans = n1*n1*n1;
    }
    void display()
    {
        System.out.println("The ans is: "+ans);
    }
    public static void main()
    {
        extra6 obj = new extra6();
        obj.init(7);
        obj.calc();
        obj.display();
    }
}