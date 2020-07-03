class Random_nos_Q3
{
    double ans;
    void display()
    {
        for(int i =1; i<=20; i++)
        {
            ans = (Math.random()*100);//the function random() generates any random no. between 0 and 1 and so to bring it between 1 to 100, we multiply it with 100
            System.out.println("Random number: "+ ans);
        }
    }
    public static void main()
    {
        Random_nos_Q3 obj = new Random_nos_Q3();
        obj.display();
    }
}
            
        
        