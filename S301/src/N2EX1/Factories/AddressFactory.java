package N2EX1.Factories;
import N2EX1.Clases.Clases.AddressSpain;
import N2EX1.Clases.Clases.AddressUganda;
import N2EX1.Interfaces.*;
public class AddressFactory implements AbstractInterface {
    @Override
    public PhoneNumber getPhoneNumber(String phone) {
        return null;
    }

    @Override
    public Address getAddress(String address) {

        if (address == null) {
            System.out.println("Introduce an Address.");
        } else if (address.equalsIgnoreCase("Spain")) {
            return new AddressSpain();}
        else if (address.equalsIgnoreCase("Uganda")) {
            return new AddressUganda();}
        return null;
    }
}
