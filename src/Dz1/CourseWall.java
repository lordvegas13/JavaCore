package Dz1;

public class CourseWall implements CourseLet{

    private float height;

    public CourseWall(float height) {
        this.height = height;
    }
    @Override
    public boolean doIt(TeamAnimal animal) {
        if (animal instanceof Jumpable)
            return ((Jumpable) animal).jump(height);
        else
            return false;
    }
    public float getHeight(){
        return height;
    }

}
