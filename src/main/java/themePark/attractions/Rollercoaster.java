package themePark.attractions;

import themePark.ISecurity;
import themePark.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name){
        super(name);
        }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge () > 12 && visitor.getHeight () > 145;
    }
}
