public class Solutions {
    public static int max3(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        else {
            return c;
        }
        
    }

    public static double max3(double a, double b, double c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        else {
            return c;
        }
    }

    public static boolean odd(boolean a, boolean b, boolean c) {
        int oddTotal = 0;
        if (a) {
            oddTotal++;
        }
        if (b) {
            oddTotal++;
        }
        if (c) {
            oddTotal++;
        }
        switch (oddTotal) {
            case 1: {return true;}
            case 3: {return true;}
            default: {return false;}
        }
    }

    public static boolean majority(boolean a, boolean b, boolean c) {
        boolean output = a && b || b && c || c && a;
        return output;
        }

    public static double trigIdentity(double x) {
        return Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(x), 2);
    }

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println(max3(1,4,1));
        System.out.println(max3(-9,-7,-2));
        System.out.println(max3(3.141,2.718,.5));
        System.out.println(max3(1,2,.00001));

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println(odd(false,false,false));
        System.out.println(odd(true,false,false));
        System.out.println(odd(false,true,false));
        System.out.println(odd(true,true,false));
        System.out.println(odd(true,false,true));
        System.out.println(odd(true,true,true));

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println(majority(false,false,false));
        System.out.println(majority(true,false,false));
        System.out.println(majority(true, true, false));
        System.out.println(majority(true,false,true));
        System.out.println(majority(true,true,true));

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println(trigIdentity(1));
        System.out.println(trigIdentity(2));
        System.out.println(trigIdentity(3));
        System.out.println(trigIdentity(4));
        System.out.println(trigIdentity(5));
        System.out.println(trigIdentity(6));

        System.out.println("--------------------------------------------------------------------------------");
    }
}