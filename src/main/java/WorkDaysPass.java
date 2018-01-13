public class WorkDaysPass implements DayStrat{
    private static final Days[] passingDays = {Days.MON, Days.TUE,Days.WED,Days.THU, Days.FRI};
    public boolean isGoodDay() {
        boolean isGDay = false;
        for (Days day:
                passingDays) {
            //if (day == getCurDay())
                isGDay = true;
        }
        return isGDay;
    }
}
