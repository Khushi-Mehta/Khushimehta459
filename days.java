class days
{
    void init(int a)
    {
        switch(a)
        {
            case 1:
            case 7:
            System.out.println("Weekend!");
            break;
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("Weekedays):");
            break;
            default:
            System.out.println("INVALID");
            break;
        }
    }
    public static void main()
    {
        days obj = new days();
        obj.init(9);
    }
}