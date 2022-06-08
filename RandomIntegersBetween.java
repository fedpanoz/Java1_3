public class RandomIntegersBetween {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        double w = Math.random();
        long solution = a + Math.round((b - a) * Math.random());
        System.out.println(solution);

    }
}
