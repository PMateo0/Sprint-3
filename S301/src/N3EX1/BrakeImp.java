package N3EX1;

public class BrakeImp implements IExecute{
    private Vehicle vehicle;
    public BrakeImp(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.breakV();
    }
}
