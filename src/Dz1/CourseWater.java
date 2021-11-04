package Dz1;

public class CourseWater implements CourseLet {

    private int length;

    public CourseWater(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(TeamAnimal animal) {
        if (animal instanceof Summable)
            return ((Summable) animal).swim(length);
        else
            return false;
    }
    public int getLength(){
        return length;
    }

}
