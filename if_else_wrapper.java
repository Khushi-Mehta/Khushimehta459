class if_else_wrapper
{
    public static void main()
    {
        char a = 'K';
        if(Character.isUpperCase(a))
        {
            System.out.println("The digit is in Upper Case");
        }
        else
        {
            System.out.println("The digit is in Lower Case");
        }
        char c = '*';
        if(Character.isLetterOrDigit(c))
        {
            System.out.println("The entered value is a Letter or a Digit");
        }
        else
        {
            System.out.println("You've entered a special symbol");
        }
        char d = ' ';
        if(Character.isWhitespace(d))
        {
            System.out.println("You did not enter anything");
        }
        else
        {
            System.out.println("You've entered something: either a letter or digit or special symbol");
        }
    }
}
            
        