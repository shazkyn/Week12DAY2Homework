package themePark.stalls;


public abstract class Stall {

    private String name;
    private int rating;

    public Stall(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


