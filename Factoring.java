public class Factoring {
    public static void main(String[] args){
        long num = Long.parseLong(args[0]);
        for(long factor = 2; factor <= num / factor; factor++){
            while(num % factor == 0){
                System.out.print(factor + " ");
                num /= factor;
            }

        }
        if (num > 1)
            System.out.print(num);

    }
}
