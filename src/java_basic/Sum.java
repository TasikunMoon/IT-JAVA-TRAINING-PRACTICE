package java_basic;

public class Sum {

    public static void main(String[] args) {
        int a = 30;
        int b = 10;
        int c = a+b;
        System.out.println(c);
        int d = 30;
        int e = 20;
        int f = d-e; //d/e  // d*e
        //int g = d/e;
        double i = 30;
        double j = 20;

        double h = i/j;

        System.out.println(f);
        System.out.println(f);
        System.out.println(h);
       /* int d = 30;
        int e = 10;
        int f = a-b;
        System.out.println(f);*/

// cntl+?  or /*..*/ for code block

        String FirstName = "Tasikun";
        String LastName = "Moon";
        //String FullName = FirstName + LastName;
        String FullName = FirstName+" "+LastName;
        System.out.println(FullName);

        //unary/binary
        int m = 3;
        int n = m++;
        int o = m++; //m+1 = 3
        System.out.println("post increment = " + n);
        System.out.println(0);

        int p = 3;
        int q = ++p; // 1+3 = 4
        System.out.println("pre increment = " + q);

        //Relational Operator

        int y = 10;
        int y1 = 5;
        //system.out.println(y == y1);
        //System.out.println(y >= y1);
        //System.out.println(y <= y1);
        System.out.println(y != y1);

        //Logical operators

        int a1 = 10;
        int b1 = 5;
        int c1 = 6;
        //system.out.println(y == y1);
        //System.out.println(y >= y1);
        //System.out.println(y <= y1);
        //System.out.println((a1 > b1) && (a1 < b1));
        System.out.println((a1 > b1) || (a1 < b1));
        // 10>5 && 10 < 7
        //true         false       false

        //Assignment operators
        // //=,+=.-+, *=,/=
        int hello = 10;
        hello = 7;
        System.out.println(hello);

        int k = 9;
        // aa = aa + 10
        // k += 5;
        // k -= 11;
        k *= 11;
        System.out.println(k);







    }
}
