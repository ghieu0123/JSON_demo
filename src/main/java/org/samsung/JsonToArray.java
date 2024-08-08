package org.samsung;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;

public class JsonToArray {
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = loader.getResourceAsStream("data.json");

        Gson gson = new Gson();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        Type personListType = new TypeToken<List<Person>>(){}.getType();
        List<Person> people = gson.fromJson(reader, personListType);

        people.forEach(
                s -> s.getName().forEach(
                        ss -> System.out.print(ss.getFirstName() + " " + ss.getLastName() + ", ")
                )
        );
        System.out.print(" Fuck u");
    }
}
