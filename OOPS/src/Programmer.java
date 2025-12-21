class Employee {
    float sal = 50000;
}
public class Programmer extends Employee{
    int bonus = 10000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer's Salary : "+p.sal);
        System.out.println("Programmer's Bonus : "+p.bonus);
    }
}