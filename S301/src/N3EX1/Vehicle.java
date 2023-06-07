package N3EX1;

public class Vehicle {
    private String kind;
    public Vehicle(String kind){this.kind = kind;}

    void startUp(){System.out.println("The " + kind + " is starting up");}
    void speedUp(){System.out.println("The " + kind + " is speeding up");}
    void breakV(){System.out.println("the " + kind + " is breaking");}

}
