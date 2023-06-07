package N3EX1;

public class SpeedUpImp implements IExecute {
    private Vehicle vehicle;
    public SpeedUpImp(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.speedUp();
    }
}
