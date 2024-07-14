package practiceques;

public class networkMonitoring {
    public static void main(String[] args) {
        networkDevice router = new router("192.168.123.254",true);
        NetworkMonitor.monitorDevice(router);

        networkDevice switch1 = new Switch("00:11:22:33:44:55", 24, 20);
        NetworkMonitor.monitorDevice(switch1);

    }
}
/*Design and implement a Java program that simulates a network monitoring system. Your
system should be capable of monitoring different types of network devices, such as
routers and switches, and alerting if any devicæ are experiencing errors or downtime.
Use interfaces to define common behaviors for network devices and implement these
behaviors in different device classes.
Create an interface named NetworkDevice with at least two methods:
getStatus() which returns a String indicating the current status of the device
isAvailable() which returns a boolean indicating if the device is currently available and
functioning correctly.
Implement the NetworkDevice interface in at least three separate classes, Router and
Switch. Each class should have a constructor that sets specific properties for the device
and specific logic to determine its status and availability. */

interface networkDevice{
    String getStatus();
    boolean isAvailable();
}
class router implements networkDevice{
    private String ipAddress;
    private boolean isUp;

    public router(String ipAddress, boolean isUp){
        this.ipAddress = ipAddress;
        this.isUp = isUp;
    }
    @Override
    public String getStatus(){
        return isUp? "UP" : "Down";
    }
    @Override
    public boolean isAvailable(){
        return isUp;
    }
}
class Switch implements networkDevice{
    private String macAddress;
    private int portCount;
    private int activePortCount;

    public Switch(String macAddress, int portCount, int activePortCount) {
        this.macAddress = macAddress;
        this.portCount = portCount;
        this.activePortCount = activePortCount;
    }
    @Override
    public String getStatus(){
        return activePortCount + " / " + portCount + " ports active";
    }

    @Override
    public boolean isAvailable(){
        return activePortCount > 0;
    }
}
class NetworkMonitor {
    public static void monitorDevice(networkDevice device) {
        System.out.println("Device status: " + device.getStatus());
        if (device.isAvailable()) {
            System.out.println("Device is available.");
        } else {
            System.out.println("Device is not available. Alerting administrator.");
        }
    }
}