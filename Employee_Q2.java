class Employee_Q2
{
    float base_sal;
    double ans;
    void init(float basal)
    {
        base_sal = basal;
    }
    double calc(int hra)
    {
        ans = (base_sal)+(50*hra)/100;
        return ans;
    }
    public static void main()
    {
        Employee_Q2 obj = new Employee_Q2();//compiler will automatically form a default constructor
        obj.init(70000);
        String name = "Khushi Mehta";
        double result = obj.calc(6000);
        System.out.println("The name of the employee is "+name);
        System.out.println("Salary is: "+result);
    }
}
        
        
        
        
    
    