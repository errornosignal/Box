

public class Person
        implements
        Comparable<Person>,
        Writeable<Person> {
    private String name;


    @Override
    public String toString() {
        return String.format("Person{name='%s'}", name);
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public void write(Person obj) {

    }
}
