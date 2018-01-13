public enum TimeTerms {
    DAY1, DAY2,DAY5,DAY7,DAY14,DAY30,DAY90,DAY365;
    public int toInt(){
        switch (this){
            case DAY1:return 1;
            case DAY2:return 2;
            case DAY5:return 5;
            case DAY7:return 7;
            case DAY14:return 14;
            case DAY30:return 30;
            case DAY90:return 90;
            case DAY365:return 365;
            default:return -1;
        }
    }
}
