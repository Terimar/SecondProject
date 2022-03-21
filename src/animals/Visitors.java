package animals;

public class Visitors {
    private static int count;
    private static int maxCount;

    static {
        maxCount = 150;
    }

    public static void totalVisitors() {
        count++;
        System.out.println("Current amount visitors - " + count);
    }
}