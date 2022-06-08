public class PowerOfTwoMine {
    public static  void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int i = 0;
        int power = 1;
        while(power < n){
            power *= 2 ;
            i += 1;
            System.out.println(i + "\t" + power);
        }
    }
}
