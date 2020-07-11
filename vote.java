class vote
{
    public static void main(int age)
    {
        if(age<=18)
        {
            int ans = 18-age;
            System.out.println("YOU'RE NOT ELIGIBLE TO VOTE: TRY AFTER "+ans+" YEARS");
        }
        else
        {
            System.out.println("YOU'RE ELIGIBLE TO VOTE, MAKE A WISE DECISION");
        }
    }
}