package N2EX1.Factories;
import N2EX1.Interfaces.AbstractInterface;

public class AbstractFactory {
    public static AbstractInterface getFactory(String data) {
        if(data.equalsIgnoreCase("Address")){
            return new AddressFactory();
        }else if(data.equalsIgnoreCase("Phone Number")){
            return new PhoneNumberFactory();
        }
        return null;
    }
}
