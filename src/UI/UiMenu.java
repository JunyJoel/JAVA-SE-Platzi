package UI;

import Models.Doctor;
import Models.Patient;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class UiMenu {
    //ARGUMENTS
    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    //METHODS
    public static void showMenu(){ //Los metodos estaticos pueden ser llamados directamente sin ser instanciados
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Hello Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    //showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType){
        //userTyper == 1 (Doctor)
        //userType == 2 (Paciente)
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Juan Peña", "juan@mail.com"));
        doctors.add(new Doctor("Giovanni Borunda", "giovanni@mail.com"));
        doctors.add(new Doctor("Johanna Valverde", "johanna@mail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anahí Salgado","anahi@mail.com"));
        patients.add(new Patient("Rocio Borunda","rocio@mail.com"));
        patients.add(new Patient("Ian Hernandez","ian@mail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: a@a.com");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if(userType == 1){
                for(Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener datos el usuario loggeado
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            if(userType == 2){
                for(Patient p: patients){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
        }while(!emailCorrect);
    }

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Models.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + ". " +MONTHS[i-1]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
