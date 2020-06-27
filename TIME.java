class TIME
{
    int hrs;
    int mins;
    void input(int h, int m)
    {
        hrs = h;
        mins = m;
    }
    void AddTime(TIME obj1, TIME obj2)
    {
        int totalmins = obj1.hrs*60+obj1.mins+obj2.hrs*60+obj2.mins;
        hrs = totalmins/60;
        mins = totalmins%60;
    }
    void dispaly()
    {
        System.out.println("Time: "+hrs+" hrs, " +mins+" mins");
    }
    public static void main()
    {
        TIME obj = new TIME();
        TIME obj1 = new TIME();
        TIME obj2 = new TIME();
        obj.input(6,20);
        obj1.input(2,15);
        obj2.AddTime(obj,obj1);
        obj2.dispaly();
    }
}
    
    
    