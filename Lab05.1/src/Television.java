public class Television {
    String brand;
    int volume;
    DisplayType display = DisplayType.LED;

    public Television(String brand, int volume) {
        this.brand = brand;
        this.volume = volume;
    }

    public Television(String brand, int volume, DisplayType display) {
        this.brand = brand;
        this.volume = volume;
        this.setDisplay(display);
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Television{" +
                "brand='" + brand + '\'' +
                ", volume=" + volume +
                ", display=" + display +
                '}';
    }
}
