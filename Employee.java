class Employee//class name is 'Employee'
{
    float salary, finalsal;
    void salary(float sal)//formal parameters, called method
    {
        salary = sal;
    }
    float calc()
    {
        finalsal = salary + (50*salary)/100;
        return finalsal;//return statement
    }
    public static void main ()//main method
    {
        Employee obj = new Employee();
        String name = "Khushi Mehta";
        obj.salary(75000.0f);//caller method,actual parameters
        float result = obj.calc();
        System.out.println("The name of Employee is "+name);
        System.out.println("The total salary is "+result);
        System.out.println("So, the total salary of "+name+" is "+result);
    }
}
    