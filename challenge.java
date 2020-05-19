class challenge
{
    int ans;
    void num_calc(int num, char ch)
    {
        if(ch=='s')
        {
            ans = num*num;
            System.out.println("Entered no. was 's' and ans is "+ans);
        }
        else
        {
            ans =num*num*num;
            System.out.println("The letter chosen is other than 's' so ans is "+ans);
        }
    }
    void num_calc(int a,int b,char ch)
    {
        if(ch=='p')
        {
            ans = a*b;
            System.out.println("The ans is "+ans);
        }
        else
        {
            ans = a+b;
            System.out.println("The letter chosen is other than 'p' so ans is "+ans);
        }
    }
    public static void main()
    {
        challenge obj = new challenge();
        obj.num_calc(2,'s');
        obj.num_calc(7,4,'q');
    }
}
        
            
    
    