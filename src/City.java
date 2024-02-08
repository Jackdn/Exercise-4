public class City {
    private String city;
    private int avgTemp;

    public City(String city, int avgTemp) {
        this.city = city;
        this.avgTemp = avgTemp;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(int avgTemp) {
        this.avgTemp = avgTemp;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                ", avgTemp=" + avgTemp +
                '}';
    }
}