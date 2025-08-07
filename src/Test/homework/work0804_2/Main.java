package Test.homework.work0804_2;

public class Main {
    public static void main(String[] args) {

        ElectronicDevice[] ecs = {
                new TV("삼성"),
                new Speaker("소니"),
                new Refrigerator("LG")

        };

        for (ElectronicDevice ec : ecs) {
            ec.displayInfo();

            if (ec instanceof TV || ec instanceof Speaker) {
                ((RemoteControllable) ec).setVolume(101);
            }

            ec.displayInfo();

        }





    }
}
