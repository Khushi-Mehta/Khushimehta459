class avg1
{
    int biology,chemistry,maths;
    double ans;
    void init(int b, int c, int m)//interactive method
    {
        biology=b;//instance variable = parameterized variable
        chemistry=c;
        maths=m;
    }
    void calc()
    {
        ans = (biology+chemistry+maths)/3;//use instance variables
    }
    void display()
    {
     System.out.println("The avg marks of a students are "+ ans);
    }
}
        