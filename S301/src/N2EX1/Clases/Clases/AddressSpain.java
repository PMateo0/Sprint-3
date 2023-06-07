package N2EX1.Clases.Clases;

import N2EX1.Interfaces.Address;

public class AddressSpain implements Address {
    private String Country;
    private String City;
    private String ZIP;


    public AddressSpain() {
        this.Country = "España";
        this.City = "Barcelona";
        this.ZIP = "08005";
    }

    @Override
    public String formatAddress(){return Country + ", " + City + ", " + ZIP;}

}
