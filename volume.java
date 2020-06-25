class volume 
{
    int height,base,radius,length;
    double ans;
    final double pi = 3.14;
    volume(int h, int b, int r,int l)
    {
        height = h;
        base = b;
        radius = r;
        length = l;
    }
    void cylinder()
    {
        ans = pi*radius*radius*height;
        System.out.println("The volume of cylinder is "+ans);
    }
    void cone()
    {
        ans = (pi*radius*radius*height)/3;
        System.out.println("The voulme of cone is "+ans);
    }
}
    