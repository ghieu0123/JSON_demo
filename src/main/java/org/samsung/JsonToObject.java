package org.samsung;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JsonToObject {
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = loader.getResourceAsStream("data.json");

        Gson gson = new Gson();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        Person p1 = gson.fromJson(reader, Person.class);

        p1.getName().forEach(
                s -> System.out.println(s.getLastName() + " " + s.getFirstName())
        );
    }
}
