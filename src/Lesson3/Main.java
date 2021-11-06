package Lesson3;

public class Main {
    public static void main(String[] args) {

        Container<BranchesBox, Integer> container1 = new Container(12345);
        Container<FriedNailsBox, String> container2 = new Container("qwert");
        Container<BranchesBox, Integer> container3 = new Container(12345);

        BranchesBox branchesBox1 = new BranchesBox();           // создаем котейнера
        BranchesBox branchesBox2 = new BranchesBox();
        BranchesBox branchesBox3 = new BranchesBox();

        FriedNailsBox friedNailsBox1 = new FriedNailsBox();
        FriedNailsBox friedNailsBox2 = new FriedNailsBox();
        FriedNailsBox friedNailsBox3 = new FriedNailsBox();

        container1.addBoxToContainer (branchesBox1);            // заполняем контейнер коробками
        container1.addBoxToContainer (branchesBox2);
        container1.addBoxToContainer (branchesBox3);

        container2.addBoxToContainer (friedNailsBox1);
        container2.addBoxToContainer (friedNailsBox2);
        container2.addBoxToContainer (friedNailsBox3);

        System.out.println(container1.getWeightOfContainer());  //выводим инфу о контейнерах
        System.out.println(container2.getWeightOfContainer());

        System.out.println(container1.compare(container2));   // сравниваем контейнера

    }

}
