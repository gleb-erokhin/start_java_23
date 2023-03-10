package HW.HW2;

// import java.util.Arrays;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

/*
Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
*/
public class SqlRequest {
    public static void main(String[] args) {

        try(Object o = new JSONParser().parse(new FileReader("D:/4. Projects/7.java_prod/HW/HW2/file.json"))) {
            JSONObject j = (JSONObject) o;
            String name = (String) j.get("name");
            String country = (String) j.get("Country");
            System.out.println("name =" + name + "and" + "country =" + country);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

//        String test = "'name:Ivanov', 'country:Russia', 'city:Moscow', 'age:null'";
//        // StringBuilder nameLine = new StringBuilder(test);
//        System.out.println(test);
//        String[] y = test.strip().split(",");
//        System.out.println(y);
//        for (String w : y) {
//            System.out.println(w);
//        }
        // for (int i = 0; i < y.length; i++) {
        // System.out.println(y[i]);

        // }
    }
}

// String name = "";
// String country = "";
// String city = "";
// String age = "";
