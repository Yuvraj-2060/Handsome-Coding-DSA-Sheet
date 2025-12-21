package Generic;

public class TestDemo1 {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1("This is string");
        Demo1 d2 = new Demo1(100);

        System.out.println(d1.getvalue());
        System.out.println(d2.getvalue());

    }
}
