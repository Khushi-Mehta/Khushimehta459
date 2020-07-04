class Wrap_char
{
    public static void main()
    {
        char a = 'B';
        System.out.println(Character.isLowerCase(a));
        char b = 'K';
        System.out.println(Character.isUpperCase(b));
        char c = 'R';
        System.out.println(Character.toLowerCase(c));
        char d = 'f';
        System.out.println(Character.toUpperCase(d));
        char e = ' ';
        System.out.println(Character.isWhitespace(e));
        char f = '9';
        System.out.println(Character.isLetter(f));
        char g = '7';
        System.out.println(Character.isDigit(g));
        char h = '$';
        System.out.println(Character.isLetterOrDigit(h));
        char i = 'i';
        System.out.println(Character.isLetterOrDigit(i));
    }
}