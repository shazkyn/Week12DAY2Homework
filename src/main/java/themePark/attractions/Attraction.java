package themePark.attractions;

import themePark.IReviewed;

public abstract class Attraction implements IReviewed {

    private String name;
    private int rating;

    public Attraction(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getRating() {
        return rating;
    }
}


/*

ThemeParkTest
- before
- canVisit()

Class ThemePark
---------------
ArrayList<Attraction> themePark.attractions
ArrayList<Stall> stalls

ctor(themePark.attractions, stalls)

visit(themePark.Visitor, Attraction);



 */