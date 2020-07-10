class simple_INT
{
    int p,t;
    double r;
    double ans;//instance variables are the variables used only after object is created
    simple_INT()//constructor
    {
        p = 1000;
        r = 5.6;
        t = 4;
    }
    void init()//method
    {
        p = 5000;
        r = 4.5;
        t = 6;
    }
    double getSI()
    {
        ans = (p*r*t)/100;
        return ans;
    }
}
    
        
        