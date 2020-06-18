class Temperature
{
    double temp;
    Temperature()
    {
        temp = 92;
    }
    Temperature(double t)
    {
        temp = t;
    }
    double calc()
    {
        double cel = (5.0/9)*(temp - 32);
        return cel;
    }
    public double getTemp()
    {
        return temp;
    }
}