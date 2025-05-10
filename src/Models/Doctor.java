package Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    /*static int id = 0;  //static permite que todos los cambios realizados en la variable
                        //se conserven a lo largo de toooodo el programa
                        //sin importar donde se realicen los cambios o donde se lean.*/
    private String speciality;
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    /* ***************************************************************************************************** */
//  COSTRUCTORS
    public Doctor(String name, String email){
        super(name, email);
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

    /* ***************************************************************************************************** */
//  METHODS
    public void showName(){
        System.out.println(getName());
    }

    public void showId(){
        System.out.println("Models.Doctor ID: ");
    }

    public void addAvailableAppointment(String date, String time){
        try {
            availableAppointments.add(new AvailableAppointment(date,time));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
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
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) throws ParseException {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate(){
            return format.format(date);
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
