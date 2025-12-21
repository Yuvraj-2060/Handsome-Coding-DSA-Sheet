package Z_Java_8_Features.StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        // 1). filter

        List<String> nameList = List.of("Abhay", "Arjun", "Yuvraj", "Ajay", "Sandeep");
        List<String> listOfA = nameList.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(listOfA);
        
        // 2). Map

        List<Integer> numbers = List.of(5,4,3,2,1);
        List<Integer> sqNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(sqNumbers);

        //--------------------------------------------------------------------------------------------

        nameList.stream().forEach(e-> System.out.println(e));
//      ----------------------------  OR  --------------------------------
        nameList.stream().forEach(System.out::println); // using method reference

        // sorted
        numbers.stream().sorted().forEach(System.out::println);
        // min
        System.out.println("Minimum Number Is: "+numbers.stream().min((x, y) -> x.compareTo(y)));

    }
}
