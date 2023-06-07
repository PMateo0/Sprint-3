package N2EX1.Clases.Clases;

import N2EX1.Interfaces.PhoneNumber;

public class PhoneNumberUganda implements PhoneNumber {

    private String Prefix;
    private int Number;

    public PhoneNumberUganda(){
        this.Prefix= "+256";
        this.Number = 156465981;
    }
    @Override
    public String formatPhoneNumber(){return Prefix + " " + Number;}
}
