class simpleinterest
{
    int n,p,r,ans;
    simpleinterest()
    {
        n=2;
        p=10000;
        r=5;
        ans = (p*r*n)/100;
        System.out.println("The area is "+ans);
    }
    public static void main()
    {
        simpleinterest obj = new simpleinterest();
    }
}
        