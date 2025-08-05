package Test.homework.work0801;

public class Circle extends Shape {

    public Circle() {
        super("원");
    }
    public double area(double r){
        return Math.PI * r * r;
    }
    public double area(){
        return area(5.0);
    }
    @Override
    public void printInFo() {
        System.out.println("원 넓이 계산");
    }

    public static void main(String[] args) {
        Shape s = new Circle();
        s.printInFo();

    }
}
