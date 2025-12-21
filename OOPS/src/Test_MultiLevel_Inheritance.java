class Animall{
    void eat(){
        System.out.println("Eating...!");
    }
}
class Dogg extends Animall{
    void bark(){
        System.out.println("Barking...!");
    }
}
class BabyDog extends Dogg{
    void weep(){
        System.out.println("Weeping...!");
    }
}
public class Test_MultiLevel_Inheritance {
    public static void main(String[] args) {
        BabyDog obj = new BabyDog();
        obj.weep();
        obj.bark();
        obj.eat();
    }
}
