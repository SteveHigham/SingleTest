package uk.co.sjlt.singletest;

class Simple
{
    public static void main (String [] args)
    {
        String msg = "1 + 1 = " + simpleMethod(1, 1);
        System.out.println(msg );
    }

    static int simpleMethod (int a, int b)
    { return a + b; }
}