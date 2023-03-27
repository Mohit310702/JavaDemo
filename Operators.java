class Operators
{
    static public void main(String []args)
    {
        //Arithmetic Operators

        // int num1 =30;
        // int num2 = 20;
        // System.out.println(num1 + num2);
        // System.out.println(num1 - num2);
        // System.out.println(num1 * num2);
        // System.out.println(num1 / num2);
        // System.out.println(2 % 3);

        
        //Assignment Operator

        // int m1,m2,m3,m4;
        // m1 = m2 = m3 = m4 = 10;
        // System.out.println(m1 + " " + m2 + " " + m3 + " " + m4);
        
        //Compound Assignment Operator
            //We can apply all aritnmetic operator to this compound Assignment Operator
        // int a = 5;
        // a %=5;
        // System.out.println(a);

        // int b = 15;
        // b /=5;
        // System.out.println(b);

        //Relational Operator
        // int a =13 ,b =14;
        // boolean result = a==b;
        // System.out.println(result);
        // System.out.println(a<b);

        //Logical Operator
        // int a =12;
        // int b =13, c =20;

        // System.out.println(a>b && b<c || a>c);

        //Ternary Operator
        int a =20,b =10,c =30;
        int res = (a>b)? a : b;
        System.out.println(res);

        String x = (a<b)? "A is smaller" : "B is smaller";
        System.out.println(x);

        int p = (a<b)? ((a<c)? a:b) : ((b<c)? b : c) ;
        System.out.println(p);

    }
}