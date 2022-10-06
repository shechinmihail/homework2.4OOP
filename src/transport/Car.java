package transport;

public final class Car extends Transport implements Competing {
    public static final String GREAT_SPEED = "Хорошая скорость";
    public static final String BAD_SPEED = "Нужно ускоряться";
    public static final String[] PIT_STOP = {"Количество Пит-Стопов", "Время Пит-Стопа"};
    public static final String[] LAP_TIME = {"Количество кругов", "Время"};

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishTheMove() {

    }

    @Override
    public String[] pitStop() {
        return PIT_STOP;
    }

    @Override
    public String[] bestLapTime() {
        return LAP_TIME;
    }

    @Override
    public void maxSpeed(String speed) {
        switch (speed) {
            case GREAT_SPEED:
                System.out.println("Показал максимальную скорость круга");
                System.out.println("Гонщик выложился полностью");
                break;
            case BAD_SPEED:
                System.out.println("Не показал максимальную скорость круга");
                System.out.println("Гонщик не отработал хорошо");
                break;
        }
    }
}





