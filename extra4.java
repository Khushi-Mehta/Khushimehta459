class extra4
{
    int length, breadth, ans;
    void init(int l, int b)
    {
        length = l;
        breadth = b;
    }
    int calc()
    {
        ans = length*breadth;
        return ans;
    }
    public static void main()
    {
        extra4 obj = new extra4();
        obj.init(10,20);
        int result = obj.calc();
        System.out.println("The area of a rectangle is: " + result);
    }
}