class book
{
    String gettitle(String title)
    {
        return title;
    }
    String getcode(String code)
    {
        return code;
    }
    double getprice(double price)
    {
        return price;
    }
    public static void main()
    {
        book obj = new book();
        System.out.println(obj.gettitle("Name :When Breath Becomes Air")+obj.getcode(" Code: 1s7e4w ")+"The price is:"+obj.getprice(6.55));
    }
}

        
        