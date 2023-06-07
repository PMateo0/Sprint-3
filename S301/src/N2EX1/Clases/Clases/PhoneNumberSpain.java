package N2EX1.Clases.Clases;

import N2EX1.Interfaces.PhoneNumber;

public class PhoneNumberSpain implements PhoneNumber {

    private String Prefix;
    private int Number;

    public PhoneNumberSpain(){
        this.Prefix= "+34";
        this.Number = 659874321;
    }
    @Override
    public String formatPhoneNumber(){return Prefix + " " + Number;}

}
