//package Pragramming;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//public class FindObjectExample {
//    public static void main(String[] args) {
//        // Create a list of objects
//        List<Person> personList = new ArrayList<>();
//        personList.add(new Person("John", 25));
//        personList.add(new Person("Alice", 30));
//        personList.add(new Person("Bob", 28));
//        personList.add(new Person("Emma", 22));
//
//        // Find the person with age 28
//        Optional<Person> foundPerson = personList.stream()
//                .filter(person -> person.getAge() == 28)
//                .findFirst();
//
//        // Print the result
//        if (foundPerson.isPresent()) {
//            System.out.println("BufferedReaderExample found: " + foundPerson.get());
//        } else {
//            System.out.println("BufferedReaderExample not found");
//        }
//    }
//}
//
//class Person {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public String toString() {
//        return "BufferedReaderExample [name=" + name + ", age=" + age + "]";
//    }
//}
