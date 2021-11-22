public class IsFactor {
    public static  void main(String[] args){
        long num = Long.parseLong(args[0]);
        long factor;
        for(factor = 2; factor <= num / factor; factor++){
            if(num % factor == 0){
                System.out.println(num + " is not primme azz!!!!!");
                break;
            }
        }
        if(factor >= num / factor)
            System.out.println(num + " is prime!!");
    }
}
