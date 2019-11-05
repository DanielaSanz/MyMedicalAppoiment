package Model;

public class Nurse extends User {
    private String specility;

    public Nurse(String name, String email) {
        super(name,email);
        this.specility = specility;
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital Cruz Verde");
        System.out.println("Departamento: Pediatrìa, Nutriologìa");
    }

    public String getSpecility() {
        return specility;
    }

    public void setSpecility(String specility) {
        this.specility = specility;
    }
}
