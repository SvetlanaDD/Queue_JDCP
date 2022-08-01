import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    static List<Person> generateClients() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Олег", "Иванов", 5));
        list.add(new Person("Ирина", "Дятлова", 3));
        list.add(new Person("Игорь", "Королев", 6));
        list.add(new Person("Оксана", "Петрова", 5));
        list.add(new Person("Ольга", "Девятова", 2));
        return list;
    }

    public static void main(String[] args) {
        Person person;
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            person = queue.poll();
            --person.tikets;
            System.out.println(person.name + ' ' + person.lasname + ' ' + "Прокатился на аттракционе / осталось билетов " + person.tikets);
            if (person.tikets != 0) {
                queue.offer(person);
            }
        }
    }
}
