import java.util.Date;

import static UI.UiMenu.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor(); //new instansia o mete a la memoria un objeto de clase Doctor() llamado myDoctor
                                        //Donde Doctor() es el metodo constructor.
        /*myDoctor.name = "Alejandro Rodriguez"; //.name es acceder a una caracteristica de la clase para modificarla
        myDoctor.showName(); //.showName() es llamar al metodo definido dentro de la clase.
        myDoctor.showId();

        Doctor MyDoctorAnn = new Doctor();
        myDoctor.showId();

        Doctor myDoctor = new Doctor("Anahi Salgado","Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "a.chavarria@patient.com");
        patient.setWeight(79.0);
        patient.setHeight(1.79);
        patient.setPhoneNumber("1234567890");

        System.out.println(patient.getName());
        if (patient.getPhoneNumber().length() > 10){
            System.out.println(patient.getPhoneNumber());
        }
        System.out.println(patient.getHeight());
        System.out.println(patient.getWeight());*/

        myDoctor.addAvailableAppointment(new Date(),"10am");
        myDoctor.addAvailableAppointment(new Date(),"11am");
        myDoctor.addAvailableAppointment(new Date(),"1pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate()+" "+aA.getTime());
        }
    }
}






























