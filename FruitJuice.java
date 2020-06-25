class FruitJuice 
{
    int product_code,pack_size,product_price,discountedp;
    String flavour,pack_type;
    FruitJuice()//default constructor
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
        System.out.println("The product code is "+product_code);
        System.out.println("The flavour of juice is "+flavour);
        System.out.println("The packaging type is "+pack_type);
        System.out.println("The packaging size is "+pack_size);
        System.out.println("The product code is "+product_code);
        System.out.println("The product price is "+discountedp);
    }
    public static void main()
    {
        FruitJuice obj =  new FruitJuice();
        obj.input(13478,600,70,"Orange Strawberry punch","PET bottle");
        obj.discount();
        obj.display();
    }
}
    
        
        
    