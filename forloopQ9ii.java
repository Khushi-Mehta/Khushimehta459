public class forloopQ9ii
{
    public static void main(double x)
    {
        double s = 0;
        for(int i=2; i<=20; i+=3)
        {
            s=s+(x/i);
        }
        System.out.println("The sum is "+s);
    }
}