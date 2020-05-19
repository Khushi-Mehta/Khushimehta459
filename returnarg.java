class returnarg
{
    int num1, num2, ans;
    void init(int a, int b)
    {
        num1 = a;
        num2 = b;
    }
    int calc()
    {
        ans = num1/num2;
        return ans;//return argument
    }//no need to make display method, print it at the end of  main method
    public static void main()
    {
        returnarg obj = new returnarg();
        obj.init(14,2);
        int result = obj.calc();
        System.out.println("The ans is: "+result);
    }
}