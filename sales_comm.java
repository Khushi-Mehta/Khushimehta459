class sales_comm
{
    int INR;
    double comm;
    void init(int inr)
    {
        INR = inr;
    }
    void calc()
    {
        if(INR<50000)
        {
            comm = (2*INR)/100.0;
            System.out.println("COMMISSION: "+comm);
        }
        else if(INR>=50000 && INR<= 20000)
        {
            comm = (5*INR)/100.0;
            System.out.println("COMMISSION: "+comm);
        }
        else 
        {
            comm = (7*INR)/100.0;
            System.out.println("COMMISSION: "+comm);
        }
    }
}