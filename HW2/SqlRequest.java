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
        String test = "{'name:Ivanov', 'country:Russia', 'city:Moscow', 'age:null'}";
        String[] subtest;
        String del = ",";
        subtest = test.split(del);
        for (int i = 0; i < subtest.length; i++) {
            System.out.println(subtest[i].charAt(i));
        }

        // работа через стрингбилдер
        // StringBuilder nameLine = new StringBuilder(test);
        // System.out.println(nameLine);
        // nameLine.append("test");
        // System.out.println(nameLine.length());
        // nameLine.delete(0, nameLine.indexOf(":") + 1);
        // System.out.println(nameLine);

        // String out = nameLine.toString().replace(":", "=").split(",");
        // String out = nameLine;
        // for (String string : uu) {
        // System.out.println(string);

        // }
        // System.out.println(test);
        // String[] y = test.strip().split(",");
        // System.out.println(y);
        // for (String w : y) {
        // System.out.println(w);
        // }
        // for (int i = 0; i < y.length; i++) {
        // System.out.println(y[i]);

        // }
    }
}

// String name = "";
// String country = "";
// String city = "";
// String age = "";
