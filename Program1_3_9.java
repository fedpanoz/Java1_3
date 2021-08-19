/*Factoring integers */
public class Program1_3_9 {
    public static void main(String[] args){
        long n = Long.parseLong(args[0]);
        for (long factor = 2; factor <= n / factor; factor++){
            while(n % factor == 0){
                n /= factor;
                System.out.print(factor + " ");
            }
        }
    }

}
