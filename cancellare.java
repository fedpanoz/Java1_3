public class cancellare {
    public static void main(String[] args){
        double a = Math.toRadians(Double.parseDouble(args[0]));
        double b = Math.pow(Math.cos(a), 2);
        double c = Math.pow(Math.sin(a), 2);
        System.out.println(b + c);


    }
    
}
