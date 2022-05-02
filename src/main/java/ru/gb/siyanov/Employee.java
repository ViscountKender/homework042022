package ru.gb.siyanov;

public class Employee {
    private String firstName;
    private String lastName;
    private String Position;
    private String email;
    private String phone;
    private long salary;
    private int age;

    public Employee(String firstName,String lastName,String Position,String email,String phone,long salary,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.Position = Position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void InformationAboutObject() {
        System.out.println("Имя: " + this.firstName + "; " + "Фамилия: " + this.lastName + "; " + "Должность: " + this.Position + "; "
        + "email: " + this.email + "; " + "Телефон: " + this.phone + "; " + "Зарплата: " + this.salary + "; " + "Возраст: " + this.age);

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

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 150){
            this.age = age;
        }

    }
    public String ToString(){
        return (firstName + lastName + Position + email + phone + salary + age );
    }



    public static void main(String[] args) {




    }






}






