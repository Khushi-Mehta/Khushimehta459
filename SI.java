class SI
{
    int p,t;
    double ans,r;
    void init()//function name and parameter list is called function signature
    {//these are non-parameterised or non-interactive methods
        p=2000;
        t=2;
        r=3.5;
    }
    void calc()//method name should be initialized in camel method, for eg: printNum, calcAns
    {
        ans=(p*r*t)/100;
    }
    void display()
    {
        System.out.println("The SI is "+ans);
    }
}
    
    