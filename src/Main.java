import Exceptions.ExeptionExercise2.WyjatekB;
import Exceptions.ExeptionExercise2.WyjatekC;
import Exceptions.Exercise1;
import Exceptions.Exercise2;
import Exceptions.ExeptionExercise2.WyjatekA;
import Exceptions.Exercise3;

import java.util.Random;


public class Main {
    public static void main(String[] args) throws Exception{
        /**
         * Zadanie 1
         * */
        Exercise1 zad1 = new Exercise1();
        zad1.printLenght("Długość");

        //Podpunkt 1
        //NullPointerException
        zad1.printLenght(null);

        //Podpunkt 2
        try {
            zad1.printLenght(null);
        } catch(NullPointerException e) {
            e.printStackTrace(System.out);
        }

        //Podpunkt 3
        try {
            zad1.printLenght(null);
        } catch(NullPointerException e) {
            e.printStackTrace(System.out);
            throw e;
        }

        //Podpunkt 4
        //Exception messages of the current method of a class, in which fillInStackTrace() method is called.
        try {
            zad1.printLenght(null);
        } catch(NullPointerException e) {
            e.printStackTrace(System.out);
            e.fillInStackTrace();
            throw e;
        }

        //Podpunkt 5
        try {
            zad1.printLenght(null);
        } catch(NullPointerException e) {
            e.printStackTrace(System.out);
            throw new Exception();
        }

        //Podpunkt 6
        try {
            zad1.printLenght(null);
        } catch(NullPointerException e) {
            throw new Exception();
        }

        /**
         * Zadanie 2
         * */

        Exercise2 zad2 = new Exercise2();

        try{
            zad2.randomizeException();
        } catch(WyjatekA a){
            System.out.println(a.getClass());
        } catch(WyjatekB b){
            System.out.println(b.getClass());
        } catch(WyjatekC c){
            System.out.println(c.getClass());
        }

        /**
         * Zadanie 3
         * */

        try{
            throw new Exercise3("W bloku try czyli oryginal");
        } catch(Exercise3 exercise3) {
            Random random = new Random();
            switch(random.nextInt(3)) {
                case 0 : throw exercise3;
                case 1 : throw new Exercise3("Nowy wyjątek");
                case 2 : throw new Exception();
            }
        } catch(Exception e) {}

    }
}