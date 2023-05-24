package Exceptions;
/**
 Napisz metodę, która jako parametr będzie przyjmowała napis i wypisywała na standardowe wyjście jego długość.
 * Przekaż do tej metody null i zobacz, jaki wyjątek został zgłoszony.
 * Otocz wywołanie metody blokiem try-catch, przechwyć ten wyjątek i wypisz na standardowe wyjście ślad stosu wywołań z chwili zgłoszenia wyjątku.
 * Bezpośrednio po wypisaniu jego śladu zgłoś obsługiwany wyjątek ponownie.
 * Przed zgłoszeniem ponownie obsługiwanego wyjątku wykonaj na nim metodę fillInStackTrace().
 * Zamiast zgłaszać ponownie obsługiwany wyjątek, zgłoś nowy wyjątek klasy Exception. Zauważ, że wymaga to pewnej dodatkowej zmiany w kodzie.
 * Dołącz obsługiwany wyjątek do nowo tworzonego wyjątku Exception jako przyczynę jego powstania.
 * */
public class Exercise1 {
    public void printLenght(String s) {
        System.out.println(s.length());
    }
}
