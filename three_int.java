class three_int//class name
{
    int a,b,c;//instance variables
    void init(int num1, int num2, int num3)//formal parameter
    {
        a = num1;
        b = num2;
        c = num3;
    }
    void calc()//method 1
    {
        if((a>b && a>c))
        {
            System.out.println("Largest number is: " + a);
        }
        else if((b>a && b>c))
        {
            System.out.println("Largest number is: " + b);
        }
        else
        {
            System.out.println("Largest number is: " + c);
        }
    }
    void display()//method 2
    {
        if((a>b && a<c)||(a<b && a>c))
        {
            System.out.println("The second highest number is: " + a);
        }
        else if((b>a && b<c)||(b<a && b>c))
        {
            System.out.println("The second highest number is: " + b);
        }
        else
        {
            System.out.println("The second highest number is: " + c);
        }
        if(a<b && a<c)
        {
            System.out.println("The lowest number is: " + a);
        }
        else if(b<a && b<c)
        {
            System.out.println("The lowest number is: " + b);
        }
        else
        {
            System.out.println("The lowest number is: " + c);
        }//there are 3 if-else constructs in all
    }
    public static void main()
    {
        three_int obj = new three_int();//default constructor
        obj.init(12,4,51);
        obj.calc();
        obj.display();
    }
}
//end the program
