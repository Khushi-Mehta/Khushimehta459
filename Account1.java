class Account1 
{
    double balance;
    Account1()
    {
        balance = 0;
    }
    void startAccount(double amt1)
    {
        balance = amt1;
    }
    void deposit(double amt2)
    {
        balance = balance + amt2;//or balance+=amt2
    }
    double withdrawmoney(double amt3)
    {
        balance = balance - amt3;//or balance-=amt3
        return amt3;
    }
    double getbalance()
    {
        return balance;
    }
}