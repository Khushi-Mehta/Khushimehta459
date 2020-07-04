class Wrapper_class
{
    public static void main()
    {
        String a = "1.0";
        double x = Double.parseDouble(a);
        double y = Double.valueOf(a);
        double f = 12.8;
        String c = Double.toString(f);
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        float k = Float.parseFloat(a);
        String m = "2";
        System.out.println(k);
        byte h = Byte.valueOf(m);
        System.out.println(h);
        long i = Long.valueOf(m);
        System.out.println(i);
    }
}
        
    
