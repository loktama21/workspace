class Television {
    private String brand;
    private int volume;

    public void turnOn(){
        boolean isConnected = verifyInternetConnection();
        System.out.println(isConnected);
        System.out.println("Turning on " + brand + " TV and volume up " + volume);
    }

    public void turnOff(){
        System.out.println("Turning off " + brand + " TV");
    }

    public String getBrand() {
        return brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean verifyInternetConnection(){
        return true;
    }

    @Override
    public String toString() {
        return brand + "\n"+ volume;
    }
}
