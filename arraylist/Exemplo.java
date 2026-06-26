package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Gustavo");
        list.add("José");
        list.add("Renan");
        list.add(2, "Marcos");
        list.add("Ronaldo");
        list.add("Gabriel");

        System.out.println(list.size());
        for(String x : list){
            System.out.println(x);
        }

        System.out.println("----------------------------");
        list.remove("Maria");
        list.remove(2);
        list.removeIf(x -> x.charAt(0) == 'R');

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("----------------------------");
        System.out.println("Index of Gustavo: " + list.indexOf("Gustavo"));
        System.out.println("Index of Ronaldo: " + list.indexOf("Ronaldo"));

        System.out.println("----------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());

        for(String x : result){
            System.out.println(x);
        }

        System.out.println("----------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
        System.out.println(name);
    }
}
