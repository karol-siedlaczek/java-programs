import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import java.awt.Container;

public abstract class Person{
    String name;
    Boolean sex;
    Integer testowa_zmienna = 10;

    Person(String name, Boolean sex) {
        this.name = name;
        this.sex = sex;
    }

   public abstract void ShowSmth() throws CloneNotSupportedException;

    public String getSex(){
        Map<String, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String result;
        if (sex) {
            result = "boy";
        }
        else {
            result = "girl";
        }
        return this.name + " is " + result;
    }
}
