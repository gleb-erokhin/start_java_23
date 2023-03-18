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
        String test = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        StringBuilder nameLine = new StringBuilder("select * from students where ");
        String[] subTest = test.split("\"");
        for (int i = 1; i < subTest.length; i += 4) {
            if (!subTest[i + 2].equals("null")) {
                if (i > 1)
                    nameLine.append(" and ");
                nameLine.append(subTest[i]).append(" = \"").append(subTest[i + 2]).append("\"");
            }
        }
        System.out.println(nameLine);

    }
}
