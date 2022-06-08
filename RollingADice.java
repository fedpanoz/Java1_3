public class RollingADice {
    public static void main(String[] args) {
        long a = Math.round(6 * Math.random());
        long b = Math.round(6 * Math.random());
        long c = a + b;
        System.out.println(c);
    }
}
