class switch1
{
    void init(int a, int b, char ch)
    {
        switch (ch)
        {
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            case '%' :
            System.out.println(a%b);
            break;
            default :
            System.out.println("INVALID");
            break;
        }
    }
    public static void main()
    {
        switch1 obj = new switch1();
        obj.init(8,2,'/');
    }
}