import transport.Car;
import transport.Competing;
import transport.Transport;

public class Driver <T extends Transport & Competing>{
    private String fullName;
    private String driverLicense;
    private int experience;

    public Driver(String fullName, String driverLicense, int experience) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void startMoving() {

    }

    public void stop(){

    }

    public void refuelTheCar(){

    }

    public void drive(T transport){
        System.out.println("Водитель " + fullName + " управляет автомобилем Б и будет участвовать в заезде!");
    }
}
