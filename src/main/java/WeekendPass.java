public class WeekendPass implements DayStrat{
    private static final Days[] passingDays = {Days.SAT, Days.SUN};
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
