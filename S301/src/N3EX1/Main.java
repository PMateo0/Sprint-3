package N3EX1;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Car");
        Vehicle vehicle2 = new Vehicle("Bicycle");
        Vehicle vehicle3 = new Vehicle("Plane");
        Vehicle vehicle4 = new Vehicle("Boat");

        StartUPImp startUPImp = new StartUPImp(vehicle1);
        StartUPImp startUPImp1 = new StartUPImp(vehicle3);
        SpeedUpImp speedUpImp = new SpeedUpImp(vehicle2);
        SpeedUpImp speedUpImp1 = new SpeedUpImp(vehicle4);
        BrakeImp brakeImp = new BrakeImp(vehicle1);
        BrakeImp brakeImp1 = new BrakeImp(vehicle4);

        Invoker ivk = new Invoker();
        ivk.recieveExecute(startUPImp);
        ivk.recieveExecute(startUPImp1);

        ivk.realizeExecution();

        ivk.recieveExecute(speedUpImp);
        ivk.recieveExecute(speedUpImp1);

        ivk.realizeExecution();

        ivk.recieveExecute(brakeImp);
        ivk.recieveExecute(brakeImp1);

        ivk.realizeExecution();

    }
}
