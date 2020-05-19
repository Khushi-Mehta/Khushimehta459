class areaOfCircle1
{
    double radius,ans;
    final double pi = 3.14;
    void init(double r)
    {
        radius=r;
    }
    void calc()
    {
        ans = (pi*radius*radius);
    }
    void display()
    {
        System.out.println("The area of a circle is "+ ans);
    }
}
/*if final double pi = 3.14 and later on if the user adds
 * pi = 3.1428 even then the program will not compile and it is 
 * compile time error
 */
   
 