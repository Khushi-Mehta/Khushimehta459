public class forloop
{
    public static void main(String args[])
    {
        int s = 0;
        for(int i=2; i<=20; i+=2)
        {
            if(i%4==0)
            {
                s=s-i;
            }
            else
            {
                s=s+i;
            }
        }
        System.out.println("The sum is "+s);
    }
}
            
            