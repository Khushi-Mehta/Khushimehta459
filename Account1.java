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
        System.out.println("You have successfully deposited "+amt2+" Rs");
    }
    double withdrawmoney(double amt3)
    {
        if(balance>=amt3)
        {
           balance = balance - amt3;//or balance-=amt3
        }
        else
        {
            System.out.println("Can't transact money,withdrawal exceeds balance");
        }
        return amt3;
        
        
    }
    double getbalance()
    {
        return balance;
    }
}