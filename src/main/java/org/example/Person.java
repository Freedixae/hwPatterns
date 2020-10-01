package org.example;

public class Person extends PersonBuilder {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        return this.age != 0;
    }

    public boolean hasAddress() {
        return this.city != null;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public void happyBirthday() {
        if (hasAge()) age++;
    }

    public void setAddress(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Человек: ").append(getName()).append(" ").append(getSurname()).append("\n");
        if (hasAge()) sb.append("Возраст: ").append(getAge()).append("\n");
        if (hasAddress()) sb.append("Город: ").append(getCity()).append("\n");
        return String.valueOf(sb);
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(getSurname())
                .setCity(getCity());
    }
}
