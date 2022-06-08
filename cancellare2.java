public class cancellare2 {
    public static void main(String[] args){
        boolean a = false;
        boolean  b = false;
        boolean c = (!(a && b) && (a || b)) || ((a && b) || !(a || b));
        System.out.println("bc" + 2 + 3);
        System.out.println(c);
        System.out.println((char)('a' + 4));
        int w = Integer.MAX_VALUE;
        System.out.println(4 * w);
        double x = 3.14159;
        System.out.println((int)(8 / x));
        boolean z = (Math.sqrt(2) * Math.sqrt(2) == 2);
        System.out.println(z);
    }
}
