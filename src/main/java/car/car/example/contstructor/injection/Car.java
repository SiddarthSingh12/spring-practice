package car.car.example.contstructor.injection;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details:"+specification.toString());
    }
}
