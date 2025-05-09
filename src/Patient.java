public class Patient {
    /* ***************************************************************************************************** */
//  ATRIBUTES
    private static int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private Double weight;
    private Double height;
    private String blood;
    /* ***************************************************************************************************** */
//  CONSTRUCTOR
    Patient(String name, String email){
        this.name = name;
        this.email = email;
    }


    /* ***************************************************************************************************** */
//  GETTERS
    public String getWeight() {
        return this.weight + "kg.";
    }

    public String getHeight() {
        return this.height + " metros.";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return "Tel." + phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBlood() {
        return blood;
    }

//  SETTERS

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 10){
            System.out.println("El numero de telefono debe tener solo 10 digitos");
        } else if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        }else{
            System.out.println("El numero de telefono debe tener 10 digitos");
        }
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
