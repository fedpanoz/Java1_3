public class Exer132 {

            public static void main(String[] args) {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);

            double discriminant = b*b - (4.0 * a * c);
            double sqroot =  Math.sqrt(discriminant);

            double root1 = (-b + sqroot) / (2.0 * a);
            double root2 = (-b - sqroot) / (2.0 * a);
            if(a == 0) System.out.println("Impossible division by 0");
            else
                if(discriminant < 0) System.out.println("Discriminant is < 0");
                else {
                    System.out.println(root1);
                    System.out.println(root2);
                }
        }
    }


