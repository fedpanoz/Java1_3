public class Exer134 {
    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        boolean check;
        if((a >= 0 && a <= 1) && (b >= 0 && b <=1)){
            check = true;
        }
        else check = false;
        System.out.println(check);
    }
}
