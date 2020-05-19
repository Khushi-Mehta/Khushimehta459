class Student//class name is 'Student'
{
    int num1,num2,num3,num4,num5;
    double total,average,percent;
    void init(int numb1,int numb2,int numb3, int numb4,int numb5)//formal parameter
    {
        num1 = numb1;
        num2 = numb2;
        num3 = numb3;
        num4 = numb4;
        num5 = numb5;
    }
    void calc()
    {
        total = num1+num2+num3+num4+num5;
        average = (total)/5;
        percent = (total*100)/500;
    }
    void display()
    {
    if(percent>=90)//if-else ladder 
    {
        System.out.println("Stream selected is "+"Science with Computers");
    }
    else if(percent>=80 && percent<=89)
    {
        System.out.println("Stream selected is "+"Science without Computers");
    }
    else if(percent>=70 && percent<=79)
    {
        System.out.println("Stream selected is "+"Commerce with Maths");
    }
    else if(percent>=60 && percent<=69)
    {
        System.out.println("Stream selected is "+"Commerce without Maths");
    }
    else 
    {
        System.out.println("INVALID");
    }
}
public static void main()//main method 
{
    Student obj = new Student();//new operator is used which creates object of a class
    String name="Khushi Mehta";
    int rollno = 8;
    obj.init(100,98,96,100,92);//actual parameters
    obj.calc();
    System.out.println("Name of student is: "+name);
    System.out.println("The roll number is: "+rollno);
    obj.display();
}
}

        
        