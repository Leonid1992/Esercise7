public class Car {

    String make;
    String model;
    int year;

    Car(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        String car = this.make + " " + this.model + " " + this.year;
        return car;
    }
    public static void main (String[] args){
        Car car = new Car("Fiat","panda",1998);
        System.out.println(car);
    }
}
