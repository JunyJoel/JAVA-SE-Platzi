import Models.Doctor;
import Models.Patient;
import Models.User;

import java.util.Date;

import static UI.UiMenu.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Doctor myDoctor = new Doctor("joel", "j@mail.com"); //new instansia o mete a la memoria un objeto de clase Models.Doctor() llamado myDoctor
                                        //Donde Models.Doctor() es el metodo constructor.
        myDoctor.name = "Alejandro Rodriguez"; //.name es acceder a una caracteristica de la clase para modificarla
        myDoctor.showName(); //.showName() es llamar al metodo definido dentro de la clase.
        myDoctor.showId();

        Models.Doctor MyDoctorAnn = new Models.Doctor();
        myDoctor.showId();

        Models.Doctor myDoctor = new Models.Doctor("Anahi Salgado","Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Models.Patient patient = new Models.Patient("Alejandra", "a.chavarria@patient.com");
        patient.setWeight(79.0);
        patient.setHeight(1.79);
        patient.setPhoneNumber("1234567890");

        System.out.println(patient.getName());
        if (patient.getPhoneNumber().length() > 10){
            System.out.println(patient.getPhoneNumber());
        }
        System.out.println(patient.getHeight());
        System.out.println(patient.getWeight());

        //myDoctor.addAvailableAppointment(new Date(),"10am");
        //myDoctor.addAvailableAppointment(new Date(),"11am");
        //myDoctor.addAvailableAppointment(new Date(),"1pm");


        for (Models.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate()+" "+aA.getTime());
        }



        Patient patient = new Patient("Gio", "G@mail.com");

        System.out.println(myDoctor);

        User user = new Doctor("Rocio", "LRBJ@mail.com");
        user.showDataUser();

        System.out.println("\n");
        System.out.println(patient);*/
        showMenu();
    }
}






























