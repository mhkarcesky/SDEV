public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person("Joe", "US");
        System.out.println(p1);

        Student s1 = new Student("Tina", "France", "Upper Pine");
        System.out.println(s1);

        Student s2 = new Student("Harry", "France", "Upper Pine");

        if (s1.equals(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
