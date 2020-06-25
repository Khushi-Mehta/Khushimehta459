class FJchange
{
    int product_code,pack_size,product_price,discountedp;
    String flavour,pack_type;
    FJchange()//default constructor
    {
        product_code = 0;
        pack_size = 0;
        product_price = 0;
        flavour = " ";
        pack_type = " ";
    }
    void input(int code,int size,int price,String fruit,String type)
    {
        product_code = code;
        pack_size = size;
        product_price = price;
        flavour = fruit;
        pack_type = type;
    }
    void discount()
    {
        discountedp = product_price - 10;
    }
    void display()
    {
        System.out.println("Code \t  Size \t  Price \t      Flavour     \t  Pack type");
        System.out.println(product_code+"  \t"+pack_size+"  \t"+product_price+"     \t"+flavour+"  \t"+pack_type);
    }
    public static void main()
    {
        FJchange obj =  new FJchange();
        obj.input(13478,600,70,"Orange Strawberry punch","PET bottle");
        obj.discount();
        obj.display();
    }
}
    
        
        
    