package week09.milano.id.ac.umn.Assignment;

public class SmartPhone extends Device implements Power, VolumeControl, Device.Connectivity {
    private int currentVolume;
    private String connectedNetwork;

    public SmartPhone(String brand, String model) {
        super(brand, model);
        this.currentVolume = 0;
        this.connectedNetwork = null;
    }

    // Implementasi Power
    public void turnOn() {
        System.out.println("Turning on the device...");
    }

    public void turnOff() {
        System.out.println("Turning off the device...");
    }

    // Implementasi VolumeControl
    public void increaseVolume(int level) {
        currentVolume += level;
        System.out.println("Increasing volume by " + level + " levels.");
    }

    public void decreaseVolume(int level) {
        currentVolume -= level;
        System.out.println("Decreasing volume by " + level + " levels.");
    }

    // Implementasi Connectivity
    public void connectToWiFi(String networkName) {
        connectedNetwork = networkName;
        System.out.println("Connecting to WiFi: " + networkName);
    }

    public void disconnectFromWiFi() {
        connectedNetwork = null;
        System.out.println("Disconnecting from WiFi...");
    }
}
