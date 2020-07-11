//start the program
class calc_4//class name
{
    int a, b;
    char ch;//instance variables
    void init(int num1, int num2, char c)//parameterized method 1; formal parameters; called method
    {
        a = num1;
        b = num2;
        ch = c;
    }
    void calc()//method 2 
    {
        if(ch == '+')//if else if ladder
        {
            System.out.println("The sum is: " + (a+b));
        }
        else if(ch == '-')
        {
            System.out.println("The difference is: " + (a-b));
        }
        else if(ch == '/')
        {
            System.out.println("The quotient is: " + (a/b));
        }
        else if(ch == '*')
        {
            System.out.println("The product is: " + (a*b));
        }
        else
        {
            System.out.println("IVALID CHARACTER ENTERED");
        }
    }
    public static void main()//main method
    {
        calc_4 obj = new calc_4();
        obj.init(12,4,'*');//actual parameter; caller/ calling method
        obj.calc();
    }
}
//end the program, program terminates
        
            
    
    