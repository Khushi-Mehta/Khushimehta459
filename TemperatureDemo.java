class TemperatureDemo
{
    public static void main()
    {
        Temperature temp = new Temperature();
        System.out.println("In Fahrenheit: "+temp.getTemp());
        System.out.println("In celcius: "+temp.calc());
        Temperature temp1 = new Temperature(95);
        System.out.println("In Fahrenheit: "+temp1.getTemp());
        System.out.println("In celcius: "+temp1.calc());
    }
}

        