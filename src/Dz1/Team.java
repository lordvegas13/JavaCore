package Dz1;

import java.util.Random;

public class Team {
    private String nameTeam;
    TeamAnimal[] zoo = {new TeamCat("Мурчало"), new TeamHen("Ряба"), new TeamHuman("Алефтина")};
    public TeamAnimal[] teamAnimal = new TeamAnimal[4];
    Random random = new Random();

    // Формаривание командв
    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
        for(int i = 0; i < 4; i++){
            int ran = random.nextInt(3);
            teamAnimal[i] = zoo[ran];
        }
    }
    // Вывод информации о членах команды
    public void printInformationAboutTheTeam() {
        System.out.println("Команда: " + nameTeam);
        for(TeamAnimal a : teamAnimal) {
            System.out.println(a);
            System.out.println("Предел бега: " + a.run_limit);
            if (a instanceof Summable)
                System.out.println("Предел плавания: " + ((Summable) a).getSwimLimit());
            if (a instanceof Jumpable)
                System.out.println("Предел прыжка: " + ((Jumpable) a).getJumpLimit());
        }
        System.out.println();
    }
    // Вывод информации кто прошел дистанцию
    public void passedTheDistance(){
        System.out.println(nameTeam + "\n");
        for (TeamAnimal a : teamAnimal){
            if(a.passing){
                System.out.println(a + " успешно прошел дистанцию.\n");
            } else {
                System.out.println(a + " не прошел дистанцию.\n");
            }
        }
        System.out.println();
    }
}
