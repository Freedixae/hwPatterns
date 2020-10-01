package org.example;

public class App {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .setName("Ivan")
                .setSurname("Dubovoy")
                .setAge(34)
                .build();

        System.out.println(person);
        person.setAddress("Omsk");
        person.happyBirthday();
        System.out.println(person);

        Person son = person.newChildBuilder().setName("Igor")
                .build();

        System.out.println("У " + person.getName() + " есть сын\n" + son);
        Person error = new PersonBuilder().build();
    }
}
