class average
{
    String name;
    int marks1, marks2, marks3;
    average()//a default constructor 
    {
        marks1 = 0;
        marks2 = 0;
        marks2 = 0;
    }
    void input(String n, int m1, int m2, int m3)
    {
        name = n;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }
    void calc()
    {
        double avg;
        avg = (marks1 + marks2 + marks3)/3;
        if(avg<=40)
        {
            System.out.println("Fail! Better luck next time");
        }
        else if(avg>=41 && avg<=75)
        {
            System.out.println("Second class");
        }
        else if(avg>=76 && avg<=93)
        {
            System.out.println("Good Job! First Class");
        }
        else
        {
            System.out.println("Meticulous Job, Distinction!");
        }
    }
    public static void main()
    {
        average obj = new average();
        obj.input("Khushi",98,96,99);
        obj.calc();
    }
}