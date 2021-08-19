public class PowerOfTwo {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int i = 0;
        int power = 1;
        while(i <= n){
            System.out.println(i + " " + power);
            power = power * 2;

            i = i + 1;

        }
        System.out.println(Integer.MAX_VALUE + 1);
    }
}
