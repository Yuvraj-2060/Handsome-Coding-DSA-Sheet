class Animal{
    void eat(){
        System.out.println("Animal Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barking..!");
    }
}

public class Test_SingleLevel_Inheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.bark();
        obj.eat();
    }
}
