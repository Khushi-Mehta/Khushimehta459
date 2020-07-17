class cylinder
{
    double r;
    int h;
    double ans;
    final double pi = 3.14;
    cylinder()
    {
        r=2.5;
        h=4;
    }
    void ans()
    {
        ans = pi*r*r*h;
    }
    public static void main()
    {
        cylinder obj = new cylinder();
        System.out.println(obj.ans);
    }
}
        