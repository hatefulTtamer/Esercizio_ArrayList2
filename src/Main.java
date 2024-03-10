/*
Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato
*/

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Giovanna", 39));
        students.add(new Student("Gianna", 31));
        students.add(new Student("Anna", 22));
        students.add(new Student("Lucia", 29));
        students.add(new Student("Ester", 19));
        students.add(new Student("Alice", 18));
        students.add(new Student("Rosa", 51));
        students.add(new Student("Laura", 37));
        students.add(new Student("Elisabetta", 22));
        students.add(new Student("Barbara", 46));
        students.add(new Student("Vittoria", 41));
        students.add(new Student("Rossella", 33));
        students.sort(Comparator.comparing(Student::getAge));
        for (Student student : students) {
            System.out.println(student.getName() + ", " + student.getAge());
        }

    }
}