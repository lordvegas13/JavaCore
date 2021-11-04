package java.Lesson1;

public class Salesman extends Employee implements BonusSystem, PenaltySystem {
    public Salesman(String name, int age, double salary, String hobby) {
        super(name, age, salary, hobby);
        this.setPosition(Position.SALESMAN);
    }

    public Salesman(String name, int age, double salary) {
        super(name, age, salary);
        this.setPosition(Position.SALESMAN);
    }

    public double getBonus() {
        return this.getSalary() * 2;
    }

    public double getBonusForLoyalty() {
        return 0;
    }

    public double getBonusForProductive() {
        return 0;
    }

    public double givePenalty() {
        return 0;
    }
}