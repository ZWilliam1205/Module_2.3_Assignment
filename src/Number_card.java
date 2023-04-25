public class Number_card extends Card {
    int cardNum;

    public Number_card(int cardNum , Suits suitType){
        this.cardNum = cardNum;
        this.suitType = suitType;
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    @Override
    public int getValue() {
        return cardNum;
    }
}
