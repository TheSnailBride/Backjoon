package Multcampus.object;

interface walkable {
    default void move() {
        System.out.println("walk");
    }

}

interface Runnable {
    default void move() {
        System.out.println("Run");
    }
}
