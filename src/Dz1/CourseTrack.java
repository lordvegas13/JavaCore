package Dz1;

public class CourseTrack implements CourseLet {

    private int length;

    public CourseTrack(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(TeamAnimal animal) {
        return animal.run(length);
    }
    public int getLength(){
        return length;
    }

}
