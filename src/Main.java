public class MAIN {
    private int[] stack;    // 스택 배열
    private int top;        // 스택의 최상단 인덱스
    private int capacity;   // 스택 크기

    // 생성자
    public MyStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; // 비어있을 때 -1
    }

    // 스택에 데이터 넣기
    public void push(int value) {
        if (isFull()) {
            System.out.println("스택이 가득 찼습니다!");
            return;
        }
        stack[++top] = value;
    }

    // 스택에서 데이터 꺼내기
    public int pop() {
        if (isEmpty()) {
            System.out.println("스택이 비어있습니다!");
            return -1; // 예외 처리
        }
        return stack[top--];
    }

    // 스택 최상단 값 확인
    public int peek() {
        if (isEmpty()) {
            System.out.println("스택이 비어있습니다!");
            return -1;
        }
        return stack[top];
    }

    // 스택이 비었는지 확인
    public boolean isEmpty() {
        return top == -1;
    }

    // 스택이 가득 찼는지 확인
    public boolean isFull() {
        return top == capacity - 1;
    }

    // 스택 출력
    public void printStack() {
        if (isEmpty()) {
            System.out.println("스택이 비어있습니다!");
            return;
        }
        System.out.print("스택: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // 테스트
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack(); // 10 20 30

        System.out.println("peek: " + stack.peek()); // 30
        System.out.println("pop: " + stack.pop());   // 30
        stack.printStack(); // 10 20
    }
}
