package tests;

import com.github.javafaker.Faker;

public class TestFaker {


    public static void main(String[] args) {

        Faker faker = new Faker();
        System.out.println(faker.address().country().toUpperCase());


        System.out.println(faker.address().city());
        System.out.println(faker.address().streetAddress());
        System.out.println(faker.address().fullAddress());

        System.out.println(faker.chuckNorris().fact());
    }
}
