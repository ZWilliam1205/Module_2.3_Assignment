public class Face_card extends Card {
    FaceType face;

    public Face_card(Suits suitType , FaceType face) {
        this.suitType = suitType;
        this.face = face;
    }

    public FaceType getFace() {
        return face;
    }

    public void setFace(FaceType face) {
        this.face = face;
    }

    @Override
    public int getValue() {
        switch(face){
            case J:
                return 11;
            case Q:
                return 12;
            case K:
                return 13;
            default:
                return 0;
        }
    }
}
