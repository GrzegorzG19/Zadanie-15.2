public class Vehicle {
    private String type;
    private String mark;
    private String model;
    private int year;
    private double km;
    private int vin;



    public void setType(String type) {
        this.type = type;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getType() {
        return type;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getKm() {
        return km;
    }

    public int getVin() {
        return vin;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", km=" + km +
                ", vin=" + vin +
                '}';
    }

    public Vehicle(String type, String mark, String model, int year, double km, int vin) {
        this.type = type;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.km = km;
        this.vin = vin;
    }
}
