public class Calculate_distance {
    public static double calculate_distance(double lat1, double lon1, double lat2, double lon2) {
        // Validate latitude and longitude
        if(lat1 > 90 || lat1 < -90 || lat2 > 90 || lat2 < -90) {
            throw new IllegalArgumentException("Latitude is invalid");
        }
        if(lon1 > 180 || lon1 < -180 || lon2 > 180 || lon2 < -180) {
            throw new IllegalArgumentException("Longitude is invalid");
        }

        // Convert both latitude coordinates into radians
        double phi1 = lat1 * (Math.PI / 180);
        double phi2 = lat2 * (Math.PI / 180);

        double lambda1 = lon1 * (Math.PI / 180);
        double lambda2 = lon2 * (Math.PI / 180);

        // Calculate the differences
        double deltaPhi = phi2 - phi1;
        double deltaLambda = lambda2 - lambda1;

        // Apply Haversine formula to find a
        double a = Math.pow(Math.sin(deltaPhi / 2), 2) + Math.cos(phi1) * Math.cos(phi2) * Math.pow(Math.sin(deltaLambda / 2), 2);

        // Calculate c
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        // Calculate distance d in kilometers
        int averageRadiusOftheEarthInKilometers = 6371;
        double d = averageRadiusOftheEarthInKilometers * c;

        // Return distance d in miles
        return d / 1.609344;
    }
}


