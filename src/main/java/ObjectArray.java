public class ObjectArray {

    private Person[] a;
    private int nElems;

    public ObjectArray(int max){
        a = new Person[max];
        nElems = 0;
    }

    public void insert(String name, String lastname, int year, int month, int day){
        a[nElems] = new Person(name, lastname, year, month, day);
        nElems++;
    }

    public void display(){
        for (int i = 0; i < nElems; i++)
            a[i].displayPerson();
    }

    public void insertSort(){

        int in, out;

        for (out = 1; out < nElems; out++){
            Person temp = a[out];
            in = out;

            while (in > 0 && a[in-1].compareTo(temp) > 0){
                a[in] = a[in-1];
                --in;
            }
        a[in] = temp;
        }

    }

    public static void main(String[] args){


        ObjectArray arr = new ObjectArray(100);

        arr.insert("Bill", "Gravesen", 1998,10,25);
        arr.insert("Jackson", "Homeles", 1954,8,28);
        arr.insert("Tom", "Stathem", 1965,12,30);
        arr.insert("Jacky", "Simpson", 1985,6,13);
        arr.insert("Patt", "Homer", 1994,12,12);

        arr.display();

        System.out.println();

        arr.insertSort();
        arr.display();
    }

}
