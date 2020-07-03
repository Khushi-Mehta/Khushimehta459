class Student_Q7
{
    int mar1,mar2,mar3,mar4,mar5;
    double average;//instance variables
    void init(int m1,int m2,int m3,int m4,int m5)
    {
        mar1 = m1;
        mar2 = m2;
        mar3 = m3;
        mar4 = m4;
        mar5 = m5;
    }
    void calc()
    {
        average = (mar1 + mar2 + mar3 + mar4 + mar5)/5;
    }
    void display()
    {
        if(average >= 90)
        {
            System.out.println("YOUR STREAM IS : SCIENCE WITH COMPUTERS");
        }
        else if(average<=89 && average>=80)
        {
            System.out.println("YOUR STREAM IS : SCIENCE WITHOUT COMPUTERS");
        }
        else if(average<=79 && average >=70)
        {
            System.out.println("YOUR STREAM IS : COMMERCE WITH MATHS");
        }
        else if(average <= 69 && average >=60)
        {
            System.out.println("YOUR STREAM IS : COMMERCE WITHOUT MATHS");
        }
        else
        {
            System.out.println("YOU ARE NOT ELIGIBLE FOR ANY STREAM, BETTER LUCK NEXT TIME");
        }
    }
    public static void main()
    {
        Student_Q7 obj = new Student_Q7();//default constructor directly formed by compiler
        String name = "Khushi Mehta";
        int roll_no = 9;
        System.out.println("Your name is: "+name);
        System.out.println("Your roll ID is: "+roll_no);
        obj.init(98,99,94,96,100);
        obj.calc();
        obj.display();
    }
}
/** Name : Khushi
 * Purpose : Board Project
 * Date : 03/07/2020
 */
        
            
            