class area
{
    void area1(int a)
    {
      int ans = a*a;
      System.out.println("The ans is"+ans);
    }
    void area1(int a, int b)
    {
        int ans = a*b;
        System.out.println("The ans is"+ans);
    }
    void area1(double a)
    {
        final double pi = 3.14;
        double ans = pi*a*a;
        System.out.println("The ans is:"+ans);
    }
    public static void main()
    {
        area obj = new area();
        obj.area1(7);
        obj.area1(3,7);
        obj.area1(2.4);
    }
}