package themePark;

public class Visitor {

    private String name;
    private double height;
    private double money;
    private int age;

    public Visitor (String name, Double height, double money, int age) {
        this.name = name;
        this.height = height;
        this.money = money;
        this.age = age;
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

    public int getAge() {
        return this.age;
    }
}
