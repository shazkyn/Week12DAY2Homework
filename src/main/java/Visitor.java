

public class Visitor {

    private String name;
    private double height;
    private double money;

    public Visitor (String name, Double height, double money ) {
        this.name = name;
        this.height = height;
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return this.height;
    }

    public double getMoney() {
        return this.money;
    }

//    public void raiseSalary(double raise){
//        if (raise > 0) {
//            this.salary += raise;
//        }
//    }
//
//    public double payBonus(){
//        return this.salary * 0.01;
//    }
}