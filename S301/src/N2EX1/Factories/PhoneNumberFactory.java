package N2EX1.Factories;

import N2EX1.Clases.Clases.PhoneNumberSpain;
import N2EX1.Clases.Clases.PhoneNumberUganda;
import N2EX1.Interfaces.AbstractInterface;
import N2EX1.Interfaces.Address;
import N2EX1.Interfaces.PhoneNumber;

public class PhoneNumberFactory implements AbstractInterface {
    @Override
    public Address getAddress(String Address) {
        return null;
    }

    @Override
    public PhoneNumber getPhoneNumber(String address) {

        if (address == null) {
            System.out.println("Introduce a phone number.");
        } else if (address.equalsIgnoreCase("Spain")) {
            return new PhoneNumberSpain();}
        else if (address.equalsIgnoreCase("Uganda")) {
            return new PhoneNumberUganda();}
        return null;
    }
}