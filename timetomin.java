class timetomin
{
    int h,m;
    double s,ans;
    timetomin()
    {
        h = 12;
        m = 24;
        s = 36;
        ans = (h*60)+m+(s/60);
        System.out.println("Time in mins = "+ans);
    }
    public static void main()
    {
        timetomin obj = new timetomin ();
    }
}