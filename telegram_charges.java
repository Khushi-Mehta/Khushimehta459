import java.util.Scanner;
class telegram_charges
{
    int word;
    int charge;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("The no. of words written are : ");
        word = sc.nextInt();
    }
    void calc()
    {
        if(word<=15)
        {
            charge = 5;
            System.out.println("Dear writter, your bill is : "+charge);
        }
        else
        {
            charge = 5 + ((word-15)*1);
            System.out.println("Dear writter, your bill is : "+charge);
        }
    }
    public static void main()
    {
        telegram_charges obj = new telegram_charges();
        obj.input();
        obj.calc();
    }
}