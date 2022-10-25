import java.sql.SQLOutput;

class Television {
    private String brand;
    private int volume;

    public boolean isMuted;
    private int oldVolume;

    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    public Television() {
    }

    public Television(String brand) {
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        this.volume = volume;
    }

    public void turnOn(){
        boolean isConnected = verifyInternetConnection();
        System.out.println(isConnected);
        System.out.println("Turning on " + brand + " TV and volume up " + volume);
    }

//    public void muting(boolean mute){
//        boolean isMute = mute;
//        if(isMute){
//            setVolume(0);
//            System.out.println("It is muted.");
//        } else {
//            setVolume(this.volume);
//            System.out.println("Volume is set to " + this.volume);
//        }
//    }

    public void mute(){
        if(!isMuted()){
            oldVolume = this.volume;
            volume = 0;
            isMuted = true;
        } else {
            this.volume = oldVolume;
            isMuted = false;
        }
    }


    public void turnOff(){
        System.out.println("Turning off " + brand + " TV");
    }

    public String getBrand() {
        return this.brand;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setBrand(String brand) {
        if(brand == "Samsung" || brand == "LG" || brand == "Sony" || brand == "Toshiba"){
            this.brand = brand;
        } else {
            System.out.println("Not a correct brand");
            this.brand = brand;
        }
    }

    public void setVolume(int volume) {
        if(volume < 0 || volume > 100){
            System.out.println("Invalid volume: " + volume);
        } else {
            this.volume = volume;
            //muted = false;
        }
    }

    public boolean isMuted() {
        return isMuted;
    }

    public void setMuted(boolean muted) {
        isMuted = muted;
    }

    public int getOldVolume() {
        return oldVolume;
    }

    public void setOldVolume(int oldVolume) {
        this.oldVolume = oldVolume;
    }

    private boolean verifyInternetConnection(){
        return true;
    }

    @Override
    public String toString() {
        String volumeString = isMuted() ? "It is muted." : String.valueOf(getVolume());
        return "Brand: " + getBrand() + " Volume: "+ volume;
    }
}
