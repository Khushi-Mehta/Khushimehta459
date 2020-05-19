class SI1
{
    int principle,time;
    double ans,rate;//interactive methods will be used
    void init(int p,int t,double r)//parameterised and interactive method 
    {
        principle=p;
        time=t;
        rate=r;
    }
    void calc()
    {
        ans= (principle*rate*time)/100;
    }
    void display()
    {
        System.out.println("The SI is "+ ans);
    }
}