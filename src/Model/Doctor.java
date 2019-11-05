package Model;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private String speciality;

    public Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del Doctor asignado es: " +name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList <>();
    public void addAvailableAppoinment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Scepeciality: " + speciality +
                "\nAvailable: " + availableAppointments.toString() ;
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital Cruz Roja");
        System.out.println("Departamento: Pediatrìa");
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

    public AvailableAppointment(Date date, String time){
        this.date = date;
        this.time = time;
    }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Available Appointments \n Date: " + date + "\n Time: " + time;
        }
    }

}
