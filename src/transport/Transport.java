package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);

    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null) {
            this.brand =
                    "default";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (this.model == null) {
            this.model = "default";
        } else {
            this.model = this.model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (this.engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = this.engineVolume;
        }
    }

    public abstract void startMoving();

    public abstract void finishTheMove();
}



