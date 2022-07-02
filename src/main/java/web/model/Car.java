package web.model;

public class Car {

    private String model;
    private String country;
    private int release;

    public Car(String model, String country, int release) {
        this.model = model;
        this.country = country;
        this.release = release;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }
}
