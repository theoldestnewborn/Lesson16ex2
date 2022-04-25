import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       List<Integer> intList = new ArrayList<>();
       intList = List.of(1,2,6,6,2,3,41,53,51,3,123);
       List<String> stringList = new ArrayList<>();
       stringList = List.of("string1","string2","3string", "4string", "strings", "s-string");
    }

    public List<String > sortList (ArrayList <String> tempStringList, Comparator <?> comparator,
                                        int elementsAmount, int page) {
        List<String> newList = tempStringList.stream()
                                .sorted((Comparator<? super String>) comparator)
                                    .skip(elementsAmount*page)
                                        .limit(elementsAmount)
                                            .collect(Collectors.toList());
    return newList;
    }
}
//1. Создать в классе с методом main два неотсортированных списка со строками и числами.
//        2. Написать обобщенный метод, который на вход принимает список, компаратор
//        и два целых числа количество элементов на странице и номер странице.
//        Метод должен с помощью стримов отсортировать список с помощью компаратора.
//        И вернуть список из элементов количество которых задается первым числом.
//        А начало брать с помощью отступа (номер страницы * количество элементов).
//        3. В методе main с помощью цикла вывести постранично эти списки.