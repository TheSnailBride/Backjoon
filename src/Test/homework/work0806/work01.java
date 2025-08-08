package Test.homework.work0806;

public class work01 {

    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println(a == b); // true Intgeger 캐싱은 특정범위의 숫자(-128~127)의 미리 저장해두고 사용하기 때문에 이미 만들어진 객체가 같은 위치를 가진다.
        System.out.println(c == d); // false Integer 캐싱은 -128~127 이기 때문에 범위를 넘는다.
        System.out.println(a.equals(b)); // ? equals 는 객체가 갖고있는 값이 같은지비교한다.
        System.out.println(c.equals(d)); // ? == 는 같은 메모리 주소를 갖고 있는지를 본다


    }
}
