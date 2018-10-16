package themePark.stalls;

import themePark.ISecurity;
import themePark.Visitor;

public class TobaccoStall extends Stall implements ISecurity {
    public TobaccoStall(String name){
        super(name);
        }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() <= 15;
    }
}

