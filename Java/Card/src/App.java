public class App {
    public static void main(String[] args) throws Exception {
        Card card1 = new Card(5, "A");
        Card card2 = new Card(8, "H");

        System.out.println("Equal suit: " + Card.equalSuit(card1, card2));
        System.out.println("Equal value: " + Card.equalValue(card1, card2));

        Card card3 = new Card(5, "S");
        Card card4 = new Card(8, "S");

        System.out.println("Equal suit: " + Card.equalSuit(card3, card4));
        System.out.println("Equal value: " + Card.equalValue(card3, card4));

        Card card5 = new Card(8, "A");
        Card card6 = new Card(8, "H");

        System.out.println("Equal suit: " + Card.equalSuit(card5, card6));
        System.out.println("Equal value: " + Card.equalValue(card5, card6));

    }
}
