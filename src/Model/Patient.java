package Model;

public class Patient extends User {

    private String brithday;
    private double weight;
    private double height;
    private String blood;


    public Patient(String name, String email){
        super(name, email);
        //mas instrucciones
    }

    /*public Patient(String name, String email, String brithday) {
        super(name, email);
        this.brithday = brithday;
    }*/

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Age: " + brithday + "\n Weight: " + getWeight() +
                "\n Height: " + getHeight() + "\n Blood: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");
    }
}
