import java.util.Comparator;
public class compareBySuit implements Comparator<Card>{

    // I used switch to assign numerical values to the Suits and created the getSuitValue() method to compare the cards.

    @Override
    public int compare(Card o1, Card o2) {
        return Integer.compare(o1.getSuitValue(), o2.getSuitValue());
    }
}
