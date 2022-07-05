import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class PersonDouble{
    String name;
    Boolean sex;
    Integer testowa_zmienna = 10;

    PersonDouble(String name, Boolean sex) {
        this.name = name;
        this.sex = sex;
    }

    public abstract void ShowSmthDouble();

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
