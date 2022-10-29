package lb3.model;

public class human {
    private String lastName;
    private String firstName;

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

    private String fatherName;
    private String sex;
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
        return "Last name: " + lastName + "\n " + "First name: " + firstName + "\n " + "Father name: "
                + fatherName + "\n " + "Sex: " + sex;
    }
}
