package inharitance;

public class Manager extends Employee {

    private String position;

    public Manager() {
        super();
    }

    public Manager(int id, String name, String surname) {
        super(id, name, surname);
    }

    public Manager(int id, String name, String surname, String position) {
        super(id, name, surname);
        this.position = position;
    }

    @Override
    public void setId(int id) {
        super.setId(id + 10);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
