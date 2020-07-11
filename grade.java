class grade
{
    int marks;
    void init( int m)
    {
        marks = m;
    }
    void calc()
    {
        if(marks>75)
        {
            System.out.println("YOUR GRADE IS A");
        }
        else if(marks<=75 && marks>60)
        {
            System.out.println("YOUR GRADE IS B");
        }
        else if(marks<=60 && marks>45)
        {
            System.out.println("YOUR GRADE IS C");
        }
        else
        {
            System.out.println("YOUR GRADE IS D");
        }
    }
}
            