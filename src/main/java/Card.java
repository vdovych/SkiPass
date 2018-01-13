public abstract class Card implements Passable{
    protected String identifier;
    protected DayStrat strat;
    Card(String identifier){
        this.identifier = identifier;
    }
    public String getIdentifier() {
        return identifier;
    }
}
