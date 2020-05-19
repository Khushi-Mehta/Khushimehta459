class SI2
{
    int principle,time;
    double ans, rate;
    void init(int t, int p, double r)
    {
        principle=p;
        time=t;
        rate=r;
    }
    void calc()
    {
        ans = (principle*rate*time)/100;
    }
    void display()
    {
        System.out.println(ans);
    }
    public static void main()
    {
    SI2 obj = new SI2();
    obj.init(5,2000,2.5);
    obj.calc();
    obj.display();
}
}

