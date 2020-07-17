class avg2
{
    int num1, num2, num3;
    double ans;
    void init(int n1, int n2, int n3)
    {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }
    double calc()
    {
        ans = (num1+num2+num3)/3;
        return ans;//return statement
    }
    public static void main()//main method
    {
        avg2 obj = new avg2();//default constructor 
        obj.init(99,100,94);//actual parameters, invocation of member methods
        double result = obj.calc();
        System.out.println("The ans is: "+result);
    }
}