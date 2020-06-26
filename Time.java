class Time
{
    int hr,min,sec,ans;
    void accept(int h,int m,int s)
    {
        hr=h;
        min=m;
        sec=s;
    }
    void convert()
    {
        ans =(hr*3600)+(min*60)+(sec);
    }
    void showResult()
    {
        System.out.println("The time in seconds is "+ans);
    }
    public static void main()
    {
        Time obj = new Time();
        obj.accept(8,31,39);
        obj.convert();
        obj.showResult();
    }
}

      
        
