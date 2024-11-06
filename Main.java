 class Car {
    private String brand;
    Private String model;
    private int year;

    public String getBrand() {
        return brand;

    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year > 2021) {
            this.year = year;
        } else {
            System.out.println("Invalid year");
        }
    }

    
}

public class Main{
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Toyota");
        myCar.setModel("Innova");
        myCar.setYear(2024);

        System.out.println("Brand:"+myCar.getBrand());
        System.out.println("Model:"+myCar.getModel());
        System.out.println("Year:"+myCar.getYear());
    }
}