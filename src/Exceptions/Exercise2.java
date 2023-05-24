package Exceptions;

import Exceptions.ExeptionExercise2.WyjatekA;
import Exceptions.ExeptionExercise2.WyjatekB;
import Exceptions.ExeptionExercise2.WyjatekC;

import java.util.Random;

/**
 Napisz trzy nowe wyjątki oraz metodę, która za każdym wywołanie będzie losowo zgłaszała jeden z nich.
 * Otocz wywołanie tej metody instrukcją try-catch zawierającą po jednym bloku catch dla każdego z wyjątków. Niech każdy blok catch wypisuje, który wyjątek złapała.
 *  */

public class Exercise2 {
    public void randomizeException() throws WyjatekA, WyjatekB, WyjatekC {
        Random random = new Random();
        switch(random.nextInt(3)) {
            case 0 : throw new WyjatekA();
            case 1 : throw new WyjatekB();
            case 2 : throw new WyjatekC();
        }
    }
}
