class Add
{
    char add(int n1,int n2)
    {
        char res = n1 + n2;
        return res;
    }

    int add(int n1,int n2)
    {
        int res = n1 +n2;
        return res;
    }
}

class MethodOverloading
{
    public static void main(String args[])
    {
        Add obj = new Add();
        double res = obj.add(1,2);
        int res1 = (int)obj.add(1,3);
        System.out.println(res);
        System.out.println(res1);
    }
}