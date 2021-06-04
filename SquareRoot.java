/* A program that computes the square root of X using the Newton method */
public class SquareRoot {
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double t = x;
        for(int i = 1; i <= 15; i++){
            t = (t + x / t) / 2;
            System.out.println(t + " ");
        }
    }

    
}
