package lb4.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(lastName, human.lastName) && Objects.equals(firstName, human.firstName) && Objects.equals(fatherName, human.fatherName) && Objects.equals(sex, human.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, fatherName, sex);
    }
}
