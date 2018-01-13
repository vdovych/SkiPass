import java.util.List;

public class Tyrniket {
    private List<String> bannedCardIDs;
    Tyrniket(List<String> bannedCardIDs){
        this.bannedCardIDs = bannedCardIDs;
    }
    boolean enter(Card pass) {
        if (bannedCardIDs.contains(pass.identifier))
            return false;
        if (pass.pass()) {
            System.out.println("You may go in!\n");
            return true;
        }
        else {
            System.out.println("YOU SHALL NOT PASS!!!\n");
            return false;
        }
    }

}
