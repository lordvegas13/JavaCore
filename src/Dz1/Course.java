package Dz1;

import java.util.Random;

public class Course {
    CourseLet[] let = new CourseLet[3];
    Random random = new Random();

    // СОЗДАНИЕ ПОЛОСЫ
    public Course() {
        CourseTrack track = new CourseTrack(random.nextInt(100));
        CourseWall wall = new CourseWall(random.nextFloat() * 10);
        CourseWater water = new CourseWater(random.nextInt(100));
        let[0] = track;
        let[1] = wall;
        let[2] = water;
    }

    // ИНФО О ПРЕПЯДСТВИИ
    public void printInformationAboutTheObstacle() {
        System.out.println("Длина дорожки: " + ((CourseTrack) let[0]).getLength());
        System.out.println("Высота стены: " + ((CourseWall) let[1]).getHeight());
        System.out.println("Длина плавания: " + ((CourseWater) let[2]).getLength());
        System.out.println();
    }

    // ПРОХОЖДЕНИЕ ПОЛОСЫ
    public void passObstacles(Team team){
        for(TeamAnimal animal : team.teamAnimal){
            for(CourseLet l : let){
                if(!l.doIt(animal)){
                    animal.setPassing(l.doIt(animal));
                    break;
                }
                animal.setPassing(true);
            }
        }
    }


}
