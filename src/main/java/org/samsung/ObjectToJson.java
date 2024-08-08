package org.samsung;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ObjectToJson {
    public static void main(String[] args) throws IOException {
        Person person = new Person();
        name name = new name();
        List<name> names = new ArrayList<name>();
        names.add(name);
        name.setFirstName("Hieu");
        name.setLastName("Nguyen");
        person.setUsername("hieuvip");
        person.setAddress("cong");
        person.setName(names);

        String json = new Gson().toJson(person);
        FileWriter fileWriter = new FileWriter("src/main/resources" + "\\data2.json");
        fileWriter.write(json);
        fileWriter.close();
    }
}
