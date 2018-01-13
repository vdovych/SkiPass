public enum  PassTerms {
    PASS10, PASS20,PASS50,PASS100,PASS300,PASS666;
    public int toInt(){
        switch (this){
            case PASS10:return 10;
            case PASS20:return 20;
            case PASS50:return 50;
            case PASS100:return 100;
            case PASS300:return 300;
            case PASS666:return 666;
            default:return -1;
        }
    }
}
