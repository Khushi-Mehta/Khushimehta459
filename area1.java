class area1
{
    int num;
    double ans;
    final double pi = 3.14;
    area1(int x)//constructors-parameterized 
    {
        num = x;
        ans = pi*num*num;
        System.out.println(ans);
    }
    public static void main()
    {
        area1 obj = new area1(10);
    }
}
//constructors can be both parameterized and non parameterized just like methods
//constructors should not precced with the return type, not even void
        
        
        
