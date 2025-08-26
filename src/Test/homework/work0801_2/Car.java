package Test.homework.work0801_2;

public class Car extends Vehicle{

    Car(String brand, int year) {
        super(brand, year);
    }

    @Override
    public void printInfo(){
        System.out.println("Car 이 움직입니다.");
    }

}
}