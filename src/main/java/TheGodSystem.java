import java.util.LinkedList;
import java.util.List;

public class TheGodSystem {
    private static TyrniketFactory TFact = new TyrniketFactory();
    private List<Tyrniket> tyrnikets;
    private List<Card> allCards;
    private List<String> bannedCardIDs;

    TheGodSystem() {
        tyrnikets = new LinkedList<Tyrniket>();
        allCards = new LinkedList<Card>();
        bannedCardIDs = new LinkedList<String>();
    }

    public Tyrniket addTyrniket() {
        Tyrniket newTyrniket = new Tyrniket(bannedCardIDs);
        tyrnikets.add(newTyrniket);
        return newTyrniket;
    }

    public Card addCard(CardFactory factory) {
        return factory.manufactureCard();
    }
}
