package lessons.lesson03.OtherTasks;

public class Car {
    String country;
    String model;
    int yearOfManufacture;

    public Car(String country, String model, int yearOfManufacture) {
        this.country = country;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void printCarInfo(){
        System.out.println("Модель: " + model +
            ", страна производства: " + country +
            ", год выпуска: " + yearOfManufacture);
    }

}