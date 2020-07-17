class sum1_4
{
    public static void main(String args[])
    {
        int n,first,second,third,forth,sum;
        n = 45698;
        first = n/10000;
        n=n%10000;
        second = n/1000;
        n=n%1000;
        third = n/100;
        n=n%100;
        forth= n/10;
        n=n%10;
        sum= first+forth;
        System.out.println(sum);
    }
}