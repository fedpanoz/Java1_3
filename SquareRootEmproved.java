public class SquareRootEmproved {
    public static void main(String[] args){
        double c = Double.parseDouble(args[0]);
        double t = c;
        double PRECISION = 1e-15;
        while(Math.abs(t - c / t) > PRECISION * t){
            t = (t + c / t) / 2.0;
            System.out.println(t);
        }

    }
    
}
