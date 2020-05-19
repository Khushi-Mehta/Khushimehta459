class add2Nos
{
    int num1, num2, ans;
    void init(int a, int b)
    {
        num1 = a;
        num2 = b;
    }
    void calc()
    {
        ans = num1+num2;
    }
    void display()
    {
        System.out.println("The ans is: "+ans);
    }
    public static void main()
    {
        add2Nos obj = new add2Nos();//new object creates an object of a class
        obj.init(5,6);
        obj.calc();
        obj.display();
    }
}
    