package Models;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    /*static int id = 0;  //static permite que todos los cambios realizados en la variable
                        //se conserven a lo largo de toooodo el programa
                        //sin importar donde se realicen los cambios o donde se lean.*/
    private String speciality;

    /* ***************************************************************************************************** */
//  COSTRUCTORS
    public Doctor(String name, String email){
        super(name, email);
        this.speciality = speciality;
    }

    /* ***************************************************************************************************** */
//  METHODS
    public void showName(){
        System.out.println(getName());
    }

    public void showId(){
        System.out.println("Models.Doctor ID: ");
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    /* ***************************************************************************************************** */
//  GETTERS AND SETTERS

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setAvailableAppointments(ArrayList<AvailableAppointment> availableAppointments) {
        this.availableAppointments = availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() +"\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado: Hospital Star Medica");
        System.out.println("Departamento: Cancerologia");
    }

    /* ***************************************************************************************************** */
    /* ***************************************************************************************************** */
// SUB-CLASS
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments: \n Date: " + date + "\n Time: " +time;
        }
    }
}
