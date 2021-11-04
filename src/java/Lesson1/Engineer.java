package java.Lesson1;

public class Engineer extends Employee implements BonusSystem {
    public Engineer(String name, int age, double salary, String hobby) {
        super(name, age, salary, hobby);
        this.setPosition(Position.ENGINEER);
    }

    public Engineer(String name, int age, double salary) {
        super(name, age, salary);
        this.setHobby("none");
        this.setPosition(Position.ENGINEER);
    }

    public double getBonus() {
        return this.getSalary() * 1.2;
    }

    public double getBonusForLoyalty() {
        return 0.0;
    }

    public double getBonusForProductive() {
        return 0.0;
    }
}