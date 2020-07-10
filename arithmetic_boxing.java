class arithmetic_boxing
{
    public static void main(String args[])
    {
        Integer i = 120;
        Double d = 34.5;
        char ch = (int) 'k';
        Byte b = 11;
        Float f = 12.5f;
        double e  = i+d+ch+b+f;
        double a = i+d+-ch-b*f;
        System.out.println(e);
        System.out.println(a);
    }
}