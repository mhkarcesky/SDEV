public class Card {

    public int value;
    public String suit;

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue(int value) {
        return value;
    }

    public String getSuit(String suit) {
        return suit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public static boolean equalSuit(Card card1, Card card2) {
        if (card1.suit == card2.suit) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean equalValue(Card card1, Card card2) {
        if (card1.value == card2.value) {
            return true;
        } else {
            return false;
        }
    }

}
