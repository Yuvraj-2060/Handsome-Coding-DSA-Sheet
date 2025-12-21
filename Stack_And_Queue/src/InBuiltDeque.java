import java.util.*;

public class InBuiltDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(10);
        dq.add(20);
        dq.addFirst(30);
        dq.addLast(10);
        System.out.println(dq);
    }
}
