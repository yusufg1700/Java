package Day21AccesModifiersInheritance;

import javax.security.sasl.SaslServer;

public class Student {
    /*
    1)public    2)protected     3)default       4)private
     */
    public String stdName="TomHanks";//her class'ta kullanılabilir.

    //protected olanlar başka package'da kullanılamaz ancak package'de child class içindew kullanılabilir.
    protected String address="Miami";

    //başka package'de iseniz kullanamazsınız
    /*default*/ String eMail="th@gmail.com";// hiçbirşey yazmazsanız default olur.
    private String stdId="20206517004";//birşey private ise ona sadece o classta ulaşabiliriz.
}
