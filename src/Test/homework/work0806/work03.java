package Test.homework.work0806;


import java.util.function.Consumer;

public class work03 {


    public static String buildString(int count) {
        String result = "";
        for(int i = 0; i < count; i++) {
            result += "a";
        }
        return result;
    }


    public static StringBuffer buildStringBuffer(int count) {
        StringBuffer result = new StringBuffer();

        for(int i = 0; i < count; i++) {
            result.append("a");
        }
        return result;
    }



    public static StringBuilder buildBuilder(int count) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < count; i++) {
            result.append("a");
        }
        return result;
    }


    public static void measure(String taskname, Consumer<Integer> task, int count){
        Long start = System.nanoTime();
        task.accept(count);
        Long end = System.nanoTime();

        System.out.println(taskname + "걸린시간" + (end-start));
    }

    public static void main(String[] args) {


        final int count = 10000;
        measure("String", work03::buildString, count); // a를 추가할때마다 새로운 객체를 생성하고 기존 문자열을 복사하기 때문에 가장 오랜 시간이 걸린다.
        measure("StringBuffer", work03::buildStringBuffer, count); // 가장 빠름
        measure("StringBuilder", work03::buildBuilder, count);



    }
}
