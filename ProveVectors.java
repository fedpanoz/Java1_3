public class ProveVectors {
    public static void main(String[] args){
        String[] RANKS = {"2","3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] SUITES = {"Hearts", "Diamonds", "Spades", "Curbs"};
        String[] deck = new String[RANKS.length * SUITES.length];
        for(int i = 0; i < RANKS.length; i++){
            for(int j = 0; j < SUITES.length; j++){
                deck[SUITES.length * i + j] = RANKS[i] + " of " + SUITES[j];
            }
        }
        for(int i = 0; i < deck.length; i++){
            System.out.println(deck[i] + '\t');
        }
    }
}
