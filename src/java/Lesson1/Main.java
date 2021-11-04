package java.Lesson1;

public class Main {
    public static void main(String[] args) {
        Employee engineer1 = new Engineer("Ivan", 40, 45555.2);
        Employee engineer2 = new Salesman("Maksim", 30, 600000.0, "football");
        Employee engineer3 = new Engineer("Ivan", 40, 45555.2);
        Employee engineer4 = new Salesman("Maksim", 30, 600000.0, "football");


        System.out.println(Employee.getCountOfWorkers());

        System.out.println(engineer1.toString());
        System.out.println(engineer2.toString());

        System.out.println(engineer1.equals(engineer3));

        engineer1.info();
        engineer2.info();
    }
}
