package Generic;

public class TestDemo2 {
    public static void main(String[] args) {
        Demo2<String> d1 = new Demo2<>("Jerry Singh");
        System.out.println(d1.getContainer());
        System.out.println(d1.container.getClass().getName());

        Demo2<Integer> d2 = new Demo2<>(107);
        System.out.println(d2.getContainer());
        System.out.println(d2.container.getClass().getName());
    }
}
