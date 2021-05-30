package streamsTutorial;


import org.omg.CORBA.INTERNAL;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    //count the number of names starting with A
@Test
    public void regular() {
        ArrayList<String> names = new ArrayList();
        names.add("abhi");
        names.add("DC");
        names.add("alip");
        names.add("oli");
        int count = 0;
        for(int i=0;i<names.size();i++){
            String actual = names.get(i);
            if(actual.startsWith("a"))
                 count++;
        }
        System.out.println("number of names starting with a :"+count);

}

    @Test
    public void streamFilter() {
        ArrayList<String> names = new ArrayList();
        names.add("abhi");
        names.add("DC");
        names.add("alip");
        names.add("oli");

        long c = names.stream().filter(s->s.startsWith("a")).count();
        System.out.println(c);

        Stream.of("abc","bcd","add").filter(s->s.startsWith("a")).count(); //example to directly create stream

//        names.stream().filter(s->s.startsWith("a")).forEach((s)-> System.out.println(s)); // to print the filtered stream
        names.stream().filter(s->s.startsWith("a")).limit(1).forEach((s)-> System.out.println(s)); // limiting hte filtered stream
    }

    @Test
    public void streamMap(){
//        Stream.of("abc","bcd","add").filter(s->s.startsWith("a")).map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
        ArrayList<String> names = new ArrayList();
        names.add("abhi");
        names.add("DC");
        names.add("alip");
        names.add("oli");
        List<String> names1 = Arrays.asList("abc","bcd","add","aaa");
//        names1.stream().filter(s->s.startsWith("a")).sorted().forEach((s)-> System.out.println(s));

            Stream concatenatedStream = Stream.concat(names.stream(),names1.stream());
//        concatenatedStream.sorted().forEach((s)-> System.out.println(s)); //concatenatedStream is closed after this statement, if we
        //dont disable it, we get IllegalStateException
boolean boo =concatenatedStream.anyMatch(s->s.equals("abhi")); //stteams are case sensitive
        System.out.println(boo);
Assert.assertTrue(boo);

    }

    @Test
    public void streamCollect(){
        List<String> ls =Stream.of("abc","bcd","add").filter(s->s.startsWith("a")).collect(Collectors.toList());
        System.out.println(ls.get(0));
List<Integer> lsInt = Arrays.asList(1,3,55,22,6,1);
//print unique number and sort array
lsInt.stream().distinct().sorted().forEach((s)-> System.out.println(s));
        int i = lsInt.stream().distinct().sorted().collect(Collectors.toList()).get(2);
        System.out.println(i);
    }

}
