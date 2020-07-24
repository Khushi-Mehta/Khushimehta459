class calculator2
{
    int a,b;
    char ch;
    double ans;
    void init(int a1, int b1,char ch1)
    {
        a = a1;
        b = b1;
        ch = ch1;
    }
    void add()
    {
        ans = a+b;
        System.out.println("'+' operator entered. Sum is :"+ans);
    }
    void sub()
    {
        ans = a-b;
        System.out.println("'-' operator entered. Difference is :"+ans);
    }
    void mul()
    {
        ans = a*b;
        System.out.println("'*' operator entered. Product is :"+ans);
    }
    void div()
    {
        ans = a/b;
        System.out.println("'/' operator entered. Quotient is :"+ans);
    }
    void calculate()
    {
        switch(ch)
        {
            case '+':
            add();
            break;
            case '-':
            sub();
            break;
            case '*':
            mul();
            break;
            case '/':
            div();
            break;
            default:
            System.out.println("Invalid");
        }
    }
    public static void main(int a,int b,char ch)
    {
        calculator2 obj = new calculator2();
        obj.init(a,b,ch);
        obj.calculate();
    }
}