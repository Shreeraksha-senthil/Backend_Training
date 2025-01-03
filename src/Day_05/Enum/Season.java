package Day_05.Enum;

public enum Season {
    WINTER(30), SPRING(55), SUMMER(85), FALL(60);
    private final int avgtemp;
    Season(int avgtemp) {
        this.avgtemp = avgtemp;
    }
    public int getAvgtemp() {
        return avgtemp;
    }
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season + ": " + season.getAvgtemp());
        }
    }
}