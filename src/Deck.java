import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// This is the constructor of the Deck class. It creates a new deck of cards.
public class Deck {
    final int cardPerSuit = 13;
    LinkedList<Card> DeckOfCards;

    public Deck(){
        this.DeckOfCards = new LinkedList<Card>();

        for(int i = 0 ; i < cardPerSuit ; i++){
            if(i < 10){
                for(Suits suitType:Suits.values()){
                    Card card = new Number_card(i + 1 , suitType);
                    DeckOfCards.add(card);
                }
            }
            else{
                for(FaceType face:FaceType.values()){
                    for(Suits suitType:Suits.values()){
                        Card card = new Face_card(suitType , face);
                        DeckOfCards.add(card);
                    }

                }

            }
        }
        // This collection method shuffles the created LinkedList.
        Collections.shuffle(DeckOfCards);
    }

    // This method is used to poll a hand of seven cards and store them in a new list.
    public LinkedList<Card> PollCard(){
        LinkedList<Card> handOfSeven = new LinkedList<Card>();

        for(int i = 0 ; i < 7 ; i++){
            handOfSeven.add(DeckOfCards.poll());
        }
        return handOfSeven;
    }
}
