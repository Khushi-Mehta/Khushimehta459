class length
{
    int kms,ms,cms;
    length()
    {
        kms = 0;
        ms = 0;
        cms = 0;
    }
    length(int km, int m, int cm)
    {
        kms = km;
        ms = m;
        cms = cm;
    }
    public static void main()
    {
        length obj = new length();
        System.out.println("The default distance covered is : "+obj.kms+"/"+obj.ms+"/"+obj.cms);
        length obj1 = new length(12,14,6);
        System.out.println(obj1.kms+"/"+obj1.ms+"/"+obj1.cms);
    }
}
        