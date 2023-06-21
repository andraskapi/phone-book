public class Contact {
    // TODO vegyél fel egy név és egy telefonszám fieldet, írj konstruktort és gettereket!
    private String name;
    private int phoneNumber;

    public Contact (String name, int phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }


}
