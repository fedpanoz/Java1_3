public class LargestPower {
    public static void main (String[] args){
        int n = Integer.parseInt(args[0]);
        int i = 0;
        int power = 1;
        while ( power <= n / 2){
            power = power * 2;
            i = i + 1;

        }
        System.out.println(power);

    }
}
