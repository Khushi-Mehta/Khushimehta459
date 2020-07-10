public class TRY
{
    float feet;
    int inches;
    TRY()//default constructor
    {
        feet = 0;
        inches = 0;
    }
    TRY(float f, int i)
    {
        feet = f;
        inches = i;
    }
    float convertToFeet(TRY obj)
    {
        int y = obj.inches;
        float f = y;
        int fts = y/12;
        int ins = (int)(f-fts*12);
        f = fts;
        f+=(float)ins/10;
        return f;
    }
    int convertToInches(TRY obj)
    {
        int i;
        int fts = (int)obj.feet;
        int ins = (int)obj.inches;
        i = fts*12 + ins;
        return i;
    }
    public static void main()
    {
        TRY objFeet = new TRY(12,5);
        System.out.println(covertToFeet(objFeet));
        TRY objInches = new TRY(0,16);
        System.out.println(convertToInches());
    }
}