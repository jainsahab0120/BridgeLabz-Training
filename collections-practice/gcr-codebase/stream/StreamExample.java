import java.util.*;
class StreamExample{

    public static void main(String[] Args){

        List<Integer> list  = new ArrayList<>();

        list.add(10000);
        list.add(25000);
        list.add(30000);
        list.add(35000);
        list.add(45000);

        long count = list.stream().filter((Integer salary)-> salary > 3000).count();
        
        // stream() -- create a stream
        // filter() -- zero or more intermediate operation
        // count() -- atleast 1 terminal operation
        System.out.println(count);


        5 ways to create Stream

        // 1 - from collections 
        List <Integer> salaryList = Arrays.asList(300 , 400 , 500);

        Stream<Integer> list = new 

    }

}