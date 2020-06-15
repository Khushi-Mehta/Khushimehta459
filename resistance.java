class resistance
{
    int current,voltage,ans;
    void init(int i, int v)
    {
        current = i;
        voltage = v;
    }
    void calc()
    {
        ans = voltage/current;
    }
    void display()
    {
        System.out.println("The resistance is "+ans);
    }
    public static void main()
    {
        resistance obj = new resistance();
        obj.init(3,120);
        obj.calc();
        obj.display();
    }
}
    
  