class sym_dig_char
{
    char ch;//instance variables
    void init(char c)//method which is parameterized; formal parameters
    {
        ch = c;
    }
    void calc()
    {
        if((ch >= (int)'a' && ch <= (int)'z')||(ch >= (int)'A' && ch <= (int)'Z'))//typecasting done
        {//alternative method could be directly entering its ASCII code value
            System.out.println("It's a letter");
        }
        else if(ch >= (int)'0' && ch <= (int)'9')//if-else-if ladder
        {
            System.out.println("It's a number/ a digit ");
        }
        else
        {
            System.out.println("It's a special symbol");
        }
    }
    public static void main()//main method
    {
        sym_dig_char obj = new sym_dig_char();
        obj.init('7');//actual parameter
        obj.calc();
    }
}