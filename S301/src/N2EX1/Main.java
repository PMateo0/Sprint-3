package N2EX1;

import N2EX1.Factories.AbstractFactory;
import N2EX1.Interfaces.AbstractInterface;
import N2EX1.Interfaces.Address;
import N2EX1.Interfaces.PhoneNumber;

public class Main {
    public static void main(String[] args) {
        AbstractInterface abstractFactory = AbstractFactory.getFactory("Phone Number");
        PhoneNumber ph1 = abstractFactory.getPhoneNumber("Spain");

        AbstractInterface abstractFactory1 = AbstractFactory.getFactory("Address");
        Address add1 = abstractFactory1.getAddress("Spain");
        System.out.println(ph1.formatPhoneNumber() + ", " + add1.formatAddress());
    }
}
