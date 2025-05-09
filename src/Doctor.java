import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0;  //static permite que todos los cambios realizados en la variable
    //se conserven a lo largo de toooodo el programa
    //sin importar donde se realicen los cambios o donde se lean.
    private String name;
    private String email;
    private String speciality;


    //Available Appointment


    /*******************************************************************************************************/
//  COSTRUCTORS

    Doctor(){
        System.out.println("Construyendo el metodo Doctor...");
    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del Doctor es: " + name);
        id++;
        this.name = name; // asignamos los valores ingresados al metodo a los parametros de la clase
        this.speciality = speciality;

    }

    /* ***************************************************************************************************** */
//  METHODS
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("Doctor ID: " + id);
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

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Doctor.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    }
}
