class grades
{
    int a ;
    void init(int a1)
    {
        a = a1;
    }
    void grade()
    {
        if(a < 25)
        {
            System.out.println("F");
        }
        else if (a>=25 && a<45)
        {
            System.out.println("E");
        }
        else if(a>=45 && a<50)
        {
            System.out.println("D");
        }
        else if(a>=50 && a<60)
        {
            System.out.println("C");
        }
        else if(a>=60 && a<80)
        {
            System.out.println("B");
        }
        else
        {
            System.out.println("A");
        }
    }
    public static void main(int a)
    {
        grades obj = new grades();
        obj.init(a);
        obj.grade();
    }
}