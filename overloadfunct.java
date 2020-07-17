class overloadfunct
{
    void prnsqr(int i)
    {
        System.out.println("Integer "+i+" square is "+i*i);
        //function name should remain same.
    }
    void prnsqr(char c)//formal parameters
    {
        System.out.println(c+" is a character,thus no square");
    }
     void prnsqr(float f)
    {
        System.out.println("The square is "+f*f);
    }
    void prnsqr(double d)//overloading is being done
    {
        System.out.println("The sqaure of "+d+" is: "+d*d);
    }
    public static void main()
    {
        overloadfunct obj = new overloadfunct();
        obj.prnsqr('K');//actual parameter
        obj.prnsqr(4.5);
        obj.prnsqr(9.3f);//it is necessary to append f along with a no. to be stored in float to differentiate it from double ans imilarly with long l has to be added
        obj.prnsqr(7);
    }
}
        
    