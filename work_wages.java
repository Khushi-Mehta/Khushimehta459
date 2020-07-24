class work_wages//class name
{
    int R, H, W;//instance variables
    void init(int r, int h)//formal parametrs
    {
        R = r;
        H = h;
    }
    void calc()//calc method/function 
    {
        if(H <= 35)//if - else - if ladder 
        {
            W = (H*R);//wage when working hours is less than or equal to 35 hrs
        }
        else if(H > 35 && H <= 60)
        {
            W = (35*R)+((H-35)*((15*100)/10));//wage when working hr exceeds 35 hrs but less than 60 hrs
        }
        else if(H > 60 && H<=70)
        {
            W = (35*R)+((25*R*15)/100)+((H-60)*2*R);//max wage a man can earn as he's not allowed to work for more than 70 hrs
        }
        else
        {
            System.out.println("Work hour exceeds");//else block 
        }
    }
    void display()//display method to display the man's wages
    {
         System.out.println("The weekly wages of a person are : "+W);
    }
    public static void main()//main method to initialize
    {
        work_wages obj = new work_wages();
        obj.init(60,45);//actual parameters
        obj.calc();
        obj.display();
    }
}//program terminates