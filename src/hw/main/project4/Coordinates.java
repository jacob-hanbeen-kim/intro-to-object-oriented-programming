package hw.main.project4;

public class Coordinates {
    private final double latitude;
    private final double longitude;

    public Coordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public boolean equals(Object other) {
        // self check
        if (this == other) { return true; }
        // null check
        if (null == other) { return false; }
        // check if other is an instance of Coordinates or not
        if (!(other instanceof Coordinates)) { return false; }
        // type check and cast
        Coordinates c = (Coordinates) other;
        return latitude == c.latitude && longitude == c.longitude;
//        return Double.compare(latitude, c.latitude) == 0
//                && Double.compare((longitude, c.longitude) == 0;
    }

    public String toString() {
        return "latitude: " + this.latitude + ", longitude: " + this.longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
