package Models;

public class Nurse extends User{
    private String speciality;

    private Nurse(String name, String email){
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado: Hospital Angeles");
        System.out.println("Departamento: Nutriologia, Pediatria");
    }
}
