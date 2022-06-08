public class EvenlyDivide {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        boolean w = (a % 2 == 0 || b % 2 == 0);
        System.out.println(w);
    }
}
