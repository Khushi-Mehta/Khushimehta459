class extra3
{
    int num1, num2;
    double num3, ans;
    void init(int n1, int n2, double n3)
    {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }
    double calc()
    {
        ans = (num1+num2+num3)/3;
        return ans;
    }
    public static void main()
    {
        extra3 obj = new extra3();
        obj.init( 7,9,8.5);
        double result = obj.calc();
        System.out.println("THE ANS IS: "+result);
    }
}