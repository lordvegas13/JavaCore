package Dz1;

public class TeamHuman extends TeamAnimal implements Summable {

    private int swim_limit;
    private final int RUN_LIMIT = 50;
    private final int SWIM_LIMIT = 200;

    public TeamHuman(String name) {
        this.name = name;
        this.run_limit = RUN_LIMIT;
        swim_limit = SWIM_LIMIT;
    }
    public TeamHuman(String name, int run_limit, int swim_limit) {
        this.name = name;
        this.run_limit = run_limit;
        swim_limit = swim_limit;
    }

    @Override
    public String voice() {
        return "че кого?";
    }

    @Override
    public boolean swim(int length) {
        return swim_limit >= length;
    }
    @Override
    public int getSwimLimit(){
        return swim_limit;
    }

}
