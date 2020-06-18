class Account1Demo
{
    public static void main()
    {
        Account1 my_account = new Account1();
        my_account.startAccount(20000.00);
        my_account.deposit(540.00);
        System.out.println("Current Balance "+my_account.getbalance());
        my_account.withdrawmoney(235.00);
        System.out.println("Remaining balance "+my_account.getbalance());
    }
}