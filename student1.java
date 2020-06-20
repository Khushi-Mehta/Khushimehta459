class student1 //class name
{
    String name;
    double test1, test2, test3;//instance variables
    student1()//constructor
    {
        test1 = 99;
        test2 = 97;
        test3 = 98;
    }
    student1(int x, int y, int z)//parameterized constructor overloading 
    {
        test1 = x;
        test2 = y;
        test3 = z;
    }
    double getavg()//method
    {
        return (test1+test2+test3)/3;
    }
    public static void main()//main method
    {
        student1 std, std1, std2, std3;//referance variables
        std = new student1();
        std1 = new student1(99,94,92);
        std2 = std1;//both the referance variables point to the same object 
        std3 = null;
        std.name = "Khushi";
        std1.name = "Ritwik";
        System.out.println("Hello!, your name : "+std.name+". "+"Test avg = "+std.getavg());
        System.out.println("Hello!, your name : "+std1.name+". "+"Test avg = "+std1.getavg()); 
    }
}
        