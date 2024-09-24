package Lambdas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClassExample {
    public static void main(String[] args){
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8);
        Stream<Integer> stream = ls.stream();
        System.out.println("this will print "+stream);
        System.out.println(stream.limit(4).count());//terminal stream count


        List<Integer> result = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> result2 = result.stream().filter(n->n%2==0).collect(Collectors.toList());//filter is intermediate stream and collector is terminal
        System.out.println(result2);
    }
}
