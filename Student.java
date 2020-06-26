class Student
{
    String name;
    int age, m1, m2, m3;
    double maximum, average;
    Student(String n, int a, int marks1, int marks2, int marks3)
    {
        name = n;
        age = a;
        m1 = marks1;
        m2 = marks2;
        m3 = marks3;
    }
    void input()
    {
        name = "Khushi";
        age = 14;
        m1 = 98;
        m2 = 99;
        m3 = 94;
    }
    void calc()
    {
        maximum = Math.max(m1,(Math.max(m2,m3)));
        average = (m1+m2+m3)/3.0;
    }
    void display()
    {
        System.out.println("The name of the student is "+name);
        System.out.println("The age of the student is "+age);
        System.out.println("The max. marks of a student is "+maximum);
        System.out.println("The average marks of a student is "+average);
    }
    public static void main()
    {
        Student obj = new Student("Khushi",14,98,99,94);
        obj.input();
        obj.calc();
        obj.display();
    }
}
        