/* RollLoadedDie prints the result of rolling a loaded die suche the probability  are changed */
public class Exer135 {
    public static void main(String[] args){
        double a = Math.random();
        int roll;
        if(a < 1.0 / 8.0)
            roll = 1;
        else if(a < 2.0 / 8.0)
            roll = 2;
        else if(a < 3.0 / 8.0)
            roll = 3;
        else if (a < 4.0 / 8.0)
            roll = 4;
        else if (a < 5.0 / 8.0)
            roll = 5;
        else roll = 6;
        System.out.println("Rolling die " + roll);


    }

}
