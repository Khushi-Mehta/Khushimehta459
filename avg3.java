class avg3
{
    int b,c,m;//marks of a child denoted by variables b,c & m
    double ans;
    void init()
    {
        b=100;
        c=98;
        m=100;
    }
    void calc()
    {
        ans = (b+c+m)/3;//non- parameterized
    }
    void display()
    {
     System.out.println("The avg marks of a students are "+ ans);
    }
}
        