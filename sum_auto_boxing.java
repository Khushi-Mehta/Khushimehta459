class sum_auto_boxing
{
    public static void main(String args[])
    {
        Integer i = 100;
        Byte b = 12;
        Double d = 12.8;
        d = (i+b+d);
        System.out.println("The sum of the numbers are thus: "+d);
    }
}