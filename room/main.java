package room;

public class main {

    public static void main(String[] args) {

        MeetingRooms obj = new MeetingRooms();
        int[][] meetings1 = {
                {0, 30},
                {5, 10},
                {15, 20}
        };
        int[][] meetings2 = {
                {7, 10},
                {2, 4}
        };
        int[][] meetings3 = {
                {9, 10},
                {4, 9},
                {4, 17}
        };
        System.out.println("Example 1: " + obj.minRooms(meetings1));
        System.out.println("Example 2: " + obj.minRooms(meetings2));
        System.out.println("Example 3: " + obj.minRooms(meetings3));
    }
}