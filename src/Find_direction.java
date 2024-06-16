public class Find_direction {
    public static String find_direction(double lat1, double lon1, double lat2, double lon2) {
        char y;
        char x;

        if (lat1 > lat2) {
            y = 'S';
        } else {
            y = 'N';
        }

        if (lon1 > lon2) {
            x = 'W';
        } else {
            x = 'E';
        }

        return "" + y + x;
    }
}

