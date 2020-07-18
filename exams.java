class exams
{
    int term1,term2,final1;
    double final_marks, percentage;
    exams(int t1, int t2, int f)
    {
        term1 = t1;
        term2 = t2;
        final1 = f;
    }
    void compute()
    {
        final_marks = ((30*term1)/100) + ((30*term2)/100) + ((40*final1)/100);
        System.out.println( final_marks);
    }
    void computeperc()
    {
        percentage = (final_marks*100)/500;
        System.out.println(percentage);
    }
    public static void main()
    {
        exams obj = new exams(412,423,430);
        obj.compute();
        obj.computeperc();
    }
}