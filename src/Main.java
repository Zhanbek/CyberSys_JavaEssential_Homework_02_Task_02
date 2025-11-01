import model.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car();
        cars[1] = new Car(1996);
        cars[2] = new Car("silver");
        cars[3] = new Car(1996, "silver");

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}