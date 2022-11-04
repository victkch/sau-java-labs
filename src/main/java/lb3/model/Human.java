package lb3.model;

public class Human {
    private String lastName;
    private String firstName;
    private String fatherName;
    private String sex;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getSex() {
        return sex;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String toString() {
        return "\n Last name: " + lastName + "\n " + "First name: " + firstName + "\n " + "Father name: "
                + fatherName + "\n " + "Sex: " + sex;
    }
}
