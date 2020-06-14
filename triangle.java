class triangle 
{
    int b;
    double h,ans1,ans2;
    triangle(int x, double y)//parameterized constructor
    {
        b = x;
        h = y;
        ans1 = (b*h)/2;
        System.out.println("The area of equilateral triangle is "+ans1);
        ans2 = 3*b;
        System.out.println("The perimeter of equilateral triangle is "+ans2);
    }
    public static void main()
    {
     triangle obj = new triangle(8,2.4);
    }
}

        