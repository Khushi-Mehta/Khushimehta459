import java.util.Scanner;
class Scanner_4//details of a person prog
{
    int age;
    char gender;
    long mob_no;
    String name;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        gender = sc.next().charAt(0);
        age = sc.nextInt();
        mob_no = sc.nextLong();
    }
    void display()
    {
        System.out.println("Name : "+ name);
        System.out.println("Gender : "+ gender);
        System.out.println("Age : "+ age);
        System.out.println("Mob no. : "+ mob_no);
    }
    public static void main()
    {
        Scanner_4 obj = new Scanner_4();
        obj.input();
        obj.display();
    }
}