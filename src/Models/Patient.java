package Models;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User{
    /* ***************************************************************************************************** */
//  ATRIBUTES
    private String birthday;
    private Double weight;
    private Double height;
    private String blood;
    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();


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

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
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

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    /* ***************************************************************************************************** */
//  METHODS

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
