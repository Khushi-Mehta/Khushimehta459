class areaOfCircle//non interactive method
{
    double r,ans;//instance variables
    final double pi=3.14;//final keyword is used when the value of variable is gonna be constant like the value of pi which is constant for entire program
    void init()//method 1
    {
        r=10.5;
    }
    void calc()
    {
        ans = pi*r*r;
    }
    void display()
    {
        System.out.println("The area of a circle is "+ans);
    }
}
     