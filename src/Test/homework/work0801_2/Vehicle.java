package Test.homework.work0801_2;

public class Vehicle {
    String brand;
    int year;
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }



    public void printInfo(){
        System.out.println("Vehicle 입니다.");
    }

    public void startEngine(){
        System.out.println("기본 시동");
    }
    public void startEngine(String code){
        System.out.println("키 코드 시동:" + code );
    }
    public void startEngine(String driver, String time){
        System.out.println(driver+ " 님이 "+ time +" 에 시동을 걸었습니다.");
    }
}
