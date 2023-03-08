package HW.HW2;

// import java.util.Arrays;

/*
Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
*/
public class SqlRequest {
    public static void main(String[] args) {
        String test = "'name:Ivanov', 'country:Russia', 'city:Moscow', 'age:null'";
        StringBuilder nameLine = new StringBuilder(test);
        System.out.println(nameLine);

        // String name = "";
        // String country = "";
        // String city = "";
        // String age = "";
    }
}
