import java.util.Scanner;
class scanner_3
{
    void InputScan()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int num = sc.nextInt();
        byte num1 = sc.nextByte();
        String str = sc.nextLine();
        System.out.println("The entered no. is : "+num);
        System.out.println("The number entered is : "+num1);
        System.out.println("The token entered is: "+str);
    }
}