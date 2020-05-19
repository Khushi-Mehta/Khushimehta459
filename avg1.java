class avg1
{
    int biology,chemistry,maths;
    double ans;
    void init(int b, int c, int m)
    {
        biology=b;
        chemistry=c;
        maths=m;
    }
    void calc()
    {
        ans = (biology+chemistry+maths)/3;
    }
    void display()
    {
     System.out.println("The avg marks of a students are "+ ans);
    }
}
        