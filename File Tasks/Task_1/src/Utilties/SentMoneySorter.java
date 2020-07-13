package Utilties;

import com.company.Person;

import java.util.Comparator;

public class SentMoneySorter implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getSentMoney() - o2.getSentMoney();
    }
}
