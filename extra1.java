class extra1
{
    int s, ans1, ans2;//non-static variables
    void init()
    {
        s=5;
    }
    void calc()
    {
        ans1=s*s;
        ans2=s*s*s;
    }
    void display()
    {
        System.out.println("The square of '5' is "+ans1);
        System.out.println("The cube of '5' is "+ans2);
    }
}