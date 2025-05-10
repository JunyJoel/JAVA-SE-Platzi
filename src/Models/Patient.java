package Models;

public class Patient extends User{
    /* ***************************************************************************************************** */
//  ATRIBUTES
    private String birthday;
    private Double weight;
    private Double height;
    private String blood;

    /* ***************************************************************************************************** */
//  CONSTRUCTOR
    public Patient(String name, String email) {
        super(name,email);
    }


    /* ***************************************************************************************************** */
//  GETTERS

    public String getBirthday() {
        return birthday;
    }

    public String getBlood() {
        return blood;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getHeight() {
        return height;
    }

    //  SETTERS

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +"\n Age: " + birthday + "\n Weight: " + getWeight() + "\n Height: " + getHeight() + "\n Tipo de sangre: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo");
    }
}
