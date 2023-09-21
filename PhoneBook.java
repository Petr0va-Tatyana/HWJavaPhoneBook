//Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с
разными телефонами, их необходимо считать, как одного человека с разными телефонами. 
Вывод должен быть отсортирован по убыванию числа телефонов.

package HWJavaPhoneBook;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class PhoneBook {
    
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Ivanov", 456, bookPhone);
        addNumber("Ivanov", 12486, bookPhone);
        addNumber("Sidorov", 546561257, bookPhone);
        addNumber("Sidorov", 8956477, bookPhone);
        addNumber("Sidorov", 12356233, bookPhone);
        addNumber("Petrov", 7878972, bookPhone);
        printBook(bookPhone);
    }
}
