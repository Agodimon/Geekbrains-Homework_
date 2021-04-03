package com.company.lesson5;

public class Staff {
    private String  name;
    private String  position;
    private String  email;
    private String  telephoneNum;
    private int     salary;
    private int     age;

    public Staff(String  name, String  position,String email, String telephoneNum, int age) {
        this.name=name;
        this.position=position;
        this.email=email;
        this.telephoneNum=telephoneNum;

        setAge(age);
    }
    public Staff(){
       this.name="Nameless";
        this.position="Unknown position";
        this.email="Unknown email";
        this.telephoneNum="Unknown telephone ";
        this.age=0;


    }

    public void getInfo() {

        StringBuilder text=new StringBuilder();

        text.append(" Ф.И.О. сотрудника: ");
        text.append(getName());
        text.append(System.lineSeparator());
        text.append(" Возраст: ");
        text.append(getAge());
        if (0>=getAge()||getAge()>140){
          text.append(" лет . Вы ввели некорректный возраст. Возраст должен быть в диапазоне от 0 до 140 лет. ");
        }else {
            text.append(" лет. ");
        }

        text.append(System.lineSeparator());

            if (position.equalsIgnoreCase("Engineer")){

                setSalary(40000);
                text.append(" Должность: Engineer");
                text.append(System.lineSeparator());

            } else if(position.equalsIgnoreCase("Manager")){
                 setSalary(37000);
                text.append(" Должность: Manager");
                text.append(System.lineSeparator());
            } else if(position.equalsIgnoreCase("Developer")){
                setSalary(95000);
                text.append(" Должность: Developer");
                text.append(System.lineSeparator());

            } else {
                text.append(" Должность: 'Planner'. Возможен выбор должностей:'Engineer' or 'Manager' or 'Developer'.");
                text.append(System.lineSeparator());

                setSalary(15000);
                setPosition("Planner");
            }
            text.append(" E-mail: ");
            text.append(getEmail());
            text.append(System.lineSeparator());
            text.append(" Телефон №.: ");
            text.append(getTelephoneNum());
            text.append(System.lineSeparator());
            text.append(" Зар. плата: ");
            text.append(getSalary());
            text.append(" рублей ");
            text.append(System.lineSeparator());
            text.append(System.lineSeparator());

            System.out.println(text.toString());
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getPosition() {
        return position;
    }

    private void setPosition(String position) {
        this.position = position;

    }

    private String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int getSalary() {

        return salary;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        if (age>=0 ){
            this.age = age;
        }else{
          this.age=0;
        }

        }
    }

