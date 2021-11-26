public class daButtare {
    public static void  main(String[] args){
        int n = Integer.parseInt(args[0]);
        String s = "";
        for(int i = n; i > 0; i /= 2){
            s = s + (i % 2);
        }
        System.out.println(s);
    }
}
