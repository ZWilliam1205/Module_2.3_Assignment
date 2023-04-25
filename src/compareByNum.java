import java.util.Comparator;
public class compareByNum implements Comparator<Card>{

// I used switch to assign numerical values for the Face Cards.,and created the getValue() method in the Card class

    @Override
    public int compare(Card o1, Card o2) {
        return Integer.compare(o1.getValue(), o2.getValue());
    }
}
