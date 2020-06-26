class TriangleArea
{
    int base, height;
    int side1, side2, side3;
    double area1,area2;
    void area(int b, int h)
    {
        base = b;
        height = h;
    }
    void calc()
    {
        area1 = (base*height)/2;
        System.out.println("The area of a right angled triangle is "+area1);
    }
    void area(int s1, int s2, int s3)
    {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    void calc1()
    {
        double s = (side1+side2+side3)/3.0;
        area2 = Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
    }
    void display()
    {
        System.out.println("The area of a scalene triangle is "+area2);
    }
    public static void main()
    {
        TriangleArea obj = new TriangleArea();
        obj.area(12,7);
        obj.calc();
        obj.area(5,8,10);
        obj.calc1();
        obj.display();
    }
}
        