public class Car {
    private String brand;
    private String model;
    private int year;

    Car(String brand, String model, int year) {
        this.setBrand(brand);
        this.setModel(model);
        this.setYear(year);
    }

    Car(Car c)                      // copy constructor
    {
        this.copy(c);               // copy function called
    }


    public void setBrand(String brand) {        // getter method
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model=model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand(){               // setter method
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void copy (Car c)
    {
        this.setBrand(c.getBrand());
        this.setModel(c.getModel());
        this.setYear(c.getYear());
    }
}
