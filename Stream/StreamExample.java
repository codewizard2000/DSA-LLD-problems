package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
// it doesnt interfare with orginal data
// makes good more readable and clean
//collection of object 

public class StreamExample {
    public static void main(String[] args){
        List<String> names = Arrays.asList("rishav","honey","Alice");
        Stream<String> data2 = names.stream();
        data2.filter(name->name.startsWith("A")).forEach(System.out::println);

        Stream<String> data3 = names.stream();
        data3.forEach(n->System.out.print(n+" "));

        List<Integer> name2 = Arrays.asList(1,2,3,4,5,6,7);
        Stream<Integer> data4 = name2.stream();
        data4.forEach(n->System.out.println(2*n+" "));

        List<Integer> name5 = Arrays.asList(1,11,3,4,5,16,7);
        name5.stream().sorted().filter(n->n%2==1).map(n->2*n).forEach(n->System.out.print(n+" "));

        List<String> namease = Arrays.asList("John", "Alice", "Bob", "Emily", "David");
        namease.stream().sorted().forEach(n->System.out.print(n+ " "));

        List<String> namease3 = Arrays.asList("John", "Alice", "Bob", "Emily", "David");
        namease3.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.print(n+ " "));
    }


}
