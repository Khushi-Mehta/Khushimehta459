class cuboid
{
    int l,b,h,ans;
    cuboid()//non parameterised
    {
        l = 4;
        b = 8;
        h = 17;
        ans = l*b*h;
        System.out.println("The volume of couboid id "+ans);
    }
    public static void main()
    {
        cuboid obj = new cuboid();
    }
}