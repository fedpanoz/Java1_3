public class Cancellare3 {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int power = 1;
        while(power <= x / 2){
            power *= 2;
            System.out.println(power);
        }

    }
}
