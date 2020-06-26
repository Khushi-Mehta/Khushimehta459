class MINE 
{
    MINE()
    {
        calculate();
        System.out.println("Constructor");
    }
    public void calculate()
    {
        show();
        System.out.println("calculating");
    }
    public void show()
    {
        System.out.println("I am displaying");
    }
    public static void main(String args[])
    {
        MINE obj = new MINE();
    }
}
