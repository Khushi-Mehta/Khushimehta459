class area22
{
int r;
double ans;
final double pi = 3.14;
area22()
{
    r = 10;
}
void calc()
{
    ans = pi*r*r;
    System.out.println(ans);
}
public static void main ()
{
    area22 obj = new area22();
    obj.calc();
}
}