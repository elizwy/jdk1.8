import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        Person zhangsan = new Person("zhangsan", 12);
        Person lisi = new Person("lisi", 18);
        Person wanger = new Person("wanger", 19);

        List<Person> people = Arrays.asList(zhangsan, lisi, wanger);

        PersonTest test = new PersonTest();
        List<Person> result = test.getPersonByName("lisi", people);
        result.forEach(person -> System.out.println(person.getName()));

        result = test.getPersonByAge(19, people);
        result.forEach(person -> System.out.println(person.getName()));
    }

    private List<Person> getPersonByAge(int age, List<Person> people) {
        BiFunction<Integer,List<Person>,List<Person>> bifunction=(ageOfPerson,personList)->
                personList.stream().filter(person -> ageOfPerson.equals(person.getAge())).collect(Collectors.toList());
        return bifunction.apply(age,people);
    }

    private List<Person> getPersonByName(String name, List<Person> people) {
        return people.stream().filter(person -> name.equals(person.getName())).collect(Collectors.toList());
    }
}
