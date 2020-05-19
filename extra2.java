class extra2
{
    double base, height, ans;
    void init(int b,int h)
    {
        base = b;
        height = h;
    }
    void calc()
    {
        ans = (base*height)/2;
    }
    void display()
    {
        System.out.println("The ans is :" + ans);
    }
}
     