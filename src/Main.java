import Model.*;

import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        /*Doctor myDoctor = new Doctor("Anahí Salgado");
        myDoctor.name = "Alejandro Rodríguez";
        myDoctor.showName();*/

        /*Doctor myDoctor = new Doctor("Ana", "ana@mail.com");
        //System.out.println(myDoctor.name);
        //System.out.println(myDoctor.speciality);
        myDoctor.addAvailableAppoinment(new Date(),"4pm");
        myDoctor.addAvailableAppoinment(new Date(), "5pm");
        System.out.println((myDoctor.getAvailableAppointments()));
        System.out.println(myDoctor);*/

        /*for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate()+" "+ aA.getTime());
        }*/

        //Patient patient = new Patient("Flor", "flor@mail.com");
        //System.out.println(patient);

         User user = new Doctor("Ana Paez", "ana@mail.com");
         user.showDataUser();

         User us = new Patient("flor cuello", "flor@mail.com");
         us.showDataUser();

         User u1 = new User("vicky","vicky@mail.com") {
             @Override
             public void showDataUser() {
                 System.out.println("Doctor");
                 System.out.println("Hospital Cruz Azul");
                 System.out.println("Departamento: Geriatrìa");
             }
         };

         u1.showDataUser();

        ISchedulable iSchedulable = new AppoimentDoctor();
        iSchedulable.schedule(new Date(), "4pm");
        System.out.println(iSchedulable);
    }

}
