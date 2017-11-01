import java.time.LocalDate;

public class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private LocalDate dateOfBirth;


    public Person(String name, String surname, int year, int month, int day){
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = LocalDate.of(year, month, day);
    }


    public String getName(){
        return name;
    }

    public String getSername(){
        return surname;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public void displayPerson(){
        System.out.println("Name: " + name + " Surname: " + surname + " Date of birth " + dateOfBirth);
    }

    public String toString(){
        return  "Name " + getName() + " Lastname " + getSername() + " Date of Birth " + getDateOfBirth();
    }


    public boolean equals(Person otherPerson) {
        if (this == otherPerson)
            return true;
        if (otherPerson == null)
            return false;
        if(getClass() != otherPerson.getClass())
            return false;

        Person other = (Person) otherPerson;

        return name.equals(other.name) && surname.equals(other.surname)
                && dateOfBirth.equals(other.dateOfBirth);
    }

    public static void main(String[] args){
        Person a = new Person("Bill","Belowski",2000, 12,12);
        Person b = new Person("Bill","Belowski",2000, 12,12);
        Person c = new Person("Andrew", "Purkowski", 2001,12,25);
        Person t = new Person("Tom", "Tomski", 7956,12,23);

        System.out.println(a.equals(b) + " " + a.equals(c));
        System.out.println(a.compareTo(c) + " " + a.compareTo(b)+" "+a.compareTo(t));
    }

    @Override
    public int compareTo(Person o) {

        if (this.getName().length() < o.getName().length())
            return -1;
        else if (this.getName().length() == o.getName().length())
            return 0;
        else return 1;
    }
}