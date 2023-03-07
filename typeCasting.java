class typeCasting
{
    static public void main(String []args)
    {
        //Implicit Type Casting
        long a = 45l;
        double b;
        b = a;
        System.out.println(b);

        //Explicit Type Casting
        double c = 45.678954312;
        int d;
        d = (int)c;
        System.out.println(d);

        //Truncation
        int n1 =12;
        int n2c=5;
        float res = n1/n2c;
        System.out.println(res);

    }
}