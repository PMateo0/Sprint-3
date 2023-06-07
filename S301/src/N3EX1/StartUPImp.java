package N3EX1;

public class StartUPImp implements IExecute{
    private Vehicle vehicle;
     public StartUPImp(Vehicle vehicle){
         this.vehicle = vehicle;
     }

    @Override
    public void execute() {
        this.vehicle.startUp();
    }
}
