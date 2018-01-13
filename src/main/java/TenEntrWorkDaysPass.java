public class TenEntrWorkDaysPass extends Card{
    private int remainingPasses;
    private static final PassTerms type = PassTerms.PASS10;
    TenEntrWorkDaysPass(String identifier){
        super(identifier);
        remainingPasses = type.toInt();
        strat = new WorkDaysPass();
    }
    public boolean pass() {
        if (remainingPasses<1||!strat.isGoodDay())
            return false;
        remainingPasses--;
        return true;
    }
}
