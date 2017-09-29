package main.java.model;

import java.util.List;

public class Worker {
    private String firstName;
    private String lastName;
    private Integer age;
    private List<String> countries;
    private boolean readyForTrip = false;

    public Worker() {
    }

    public Worker(String firstName, String lastName, Integer age, List<String> countries) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.countries = countries;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public boolean isReadyForTrip() {
        return readyForTrip;
    }

    public void setReadyForTrip(boolean readyForTrip) {
        this.readyForTrip = readyForTrip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (firstName != null ? !firstName.equals(worker.firstName) : worker.firstName != null) return false;
        if (lastName != null ? !lastName.equals(worker.lastName) : worker.lastName != null) return false;
        if (age != null ? !age.equals(worker.age) : worker.age != null) return false;
        return countries != null ? countries.equals(worker.countries) : worker.countries == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (countries != null ? countries.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", countries=" + countries +
                ", readyForTrip=" + readyForTrip +
                '}'+ "\n";
    }
}
