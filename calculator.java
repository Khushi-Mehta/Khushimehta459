class calculator//class name
{
    int a,b;
    char ch;//instance variables
    double ans;
    void init(int a1,int b1,char ch1)//parameterized method
    {
        a = a1;
        b = b1;
        ch = ch1;
    }
    void add()
    {
        ans = a+b;//addition 
    }
    void sub()
    {
        ans = a-b;//subtraction
    }
    void mul() 
    {
        ans = a*b;
    }
    void div()
    {
        ans = a/b;
    }
    void calculate()
    {
        if (ch == '+')
        {
            add();
            System.out.println("Sum is : "+ans);
        }
        else if(ch == '-')
        {
            sub();
            System.out.println("Difference is : "+ans);
        }
        else if (ch == '/')
        {
            div();
            System.out.println("Quotient is : "+ans);
        }
        else if (ch == '*')
        {
            mul();
            System.out.println("Product is : "+ans);
        }
        else
        {
            System.out.println("invalid");
        }
    }
    public static void main(int a,int b,char ch)
    {
        calculator obj = new calculator();
        obj.init(a,b,ch);
        obj.calculate();
    }
}
    
        
        


    