package ie.atu;

public class Student {

    private String name;
    private String address;
    private int age;
    private  int idnumber;

    public Student() {
    }

    public Student(String name, String address, int age, int idnumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.idnumber = idnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Address: " + address + '\n' +
                "Age: " + age + '\n' +
                "IDNumber: " + idnumber + '\n';
    }
}
