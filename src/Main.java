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
                                        int elementsAmmount, int page) {
        List<String> newList = tempStringList.stream()
                                .sorted(comparator)
                                    .skip(elementsAmmount*page)
                                        .limit(elementsAmmount)
                                            .collect(Collectors.toList());
    return newList;
    }
}