import java.util.Random;
import java.util.Comparator;

public abstract class Card {
    Suits suitType;

    public abstract int getValue();
    public int getSuitValue(){
        switch(suitType){
            case SPADES:
                return 4;
            case HEARTS:
                return 3;
            case CLUBS:
                return 2;
            default:
            case DIAMONDS:
                return 1;
        }
    }
}
//    public static int compareByNum(Card one,Card two){
//        return Integer.compare(one.getValue(), two.getValue());
//    }

//    public static int compareBySuits(Card one,Card two) {
//        return Integer.compare(one.getSuitValue(), two.getSuitValue());
//    }

