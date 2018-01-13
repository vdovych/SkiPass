public class OneDayWorkDayPass extends Card {
    private int remainingDays;
    private TimeTerms type = TimeTerms.DAY1;

    OneDayWorkDayPass(String identifier) {
        super(identifier);
        remainingDays = type.toInt();
        strat = new WorkDaysPass();
    }

    public void updateDay(){
        remainingDays--;
    }
    public boolean pass() {
        return false;
    }
}
