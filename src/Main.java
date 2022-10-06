import transport.Bus;
import transport.Car;
import transport.СarАreight;

public class Main {

    public static void main(String[] args) {

        Car lada = new Car("Lada", "Grande", 1.7);
        Car audi = new Car("Audi", "A8 50L TDI quattro", 3.0);
        Car bmw = new Car("BMW", "Z8", 3.0);
        Car hyundai = new Car("Hyundai", "i30 4x4", 2.0);

        СarАreight zil = new СarАreight("Зил", "131", 6.0);
        СarАreight kamaz = new СarАreight("Камаз", "4326", 13.0);
        СarАreight tatra = new СarАreight("Tatra", "Phoenix", 12.5);
        СarАreight iveco = new СarАreight("IVECO", "Powerstar", 12.0);

        Bus liaz = new Bus("Лиаз", "Т-1000", 2.4);
        Bus solaris = new Bus("Соларис", "Super 300", 2.7);
        Bus maz = new Bus("Маз", "GP 3", 4.0);
        Bus mercedes = new Bus("Mercedes-Benz", "Super 500", 3.5);

        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(hyundai);
        printInfo(zil);
        printInfo(kamaz);
        printInfo(tatra);
        printInfo(iveco);
        printInfo(liaz);
        printInfo(solaris);
        printInfo(maz);
        printInfo(mercedes);

        Driver<Car> ivan = new Driver<>("Петров Иван Васильевич", "В", 15);
        ivan.drive(bmw);
        Driver<Bus> petr = new Driver<>("Иванов Петр Николаевич", "D", 20);
        petr.drive(maz);
        Driver<СarАreight> nikolay = new Driver<>("Фоменко Николай Иванович", "С", 16);
        nikolay.drive(zil);
    }

    private static void printInfo(Car car) {
        System.out.println(
                "Легковой автомобиль " +
                        "Марка " + car.getBrand() + '\'' +
                        ", Модель " + car.getModel() + '\'' +
                        ", Объем двигателя в литрах " + car.getEngineVolume());
    }

    private static void printInfo(СarАreight carAreight) {
        System.out.println(
                "Грузовой автомобиль, Марка " + carAreight.getBrand() + '\'' +
                        ", Модель " + carAreight.getModel() + '\'' +
                        ", Объем двигателя в литрах " + carAreight.getEngineVolume());
    }

    private static void printInfo(Bus bus) {
        System.out.println("Автобус Марка " + bus.getBrand() + '\'' + ", Модель " + bus.getModel() + '\'' +
                ", Объем двигателя в литрах " + bus.getEngineVolume());
    }
}