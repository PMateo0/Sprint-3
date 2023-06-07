package N2EX1.Clases.Clases;

import N2EX1.Interfaces.Address;

public class AddressUganda implements Address {
    private String Country;
    private String City;
    private String ZIP;

    public AddressUganda() {
        this.Country = "Uganda";
        this.City = "Kampala";
        this.ZIP = 	"10102";

    }

    @Override
    public String formatAddress(){return Country + ", " + City + ", " + ZIP;}

}
