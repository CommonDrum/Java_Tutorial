package Day25_09;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class FunctionalInterface {
    /*
    Function <T, R> – przyjmuje dowolny obiekt i zwraca dowolny obiekt (T, R),
Consumer <T> – przyjmuje dowolny obiekt, ale nic nie zwraca (T, void),
Supplier <T> – nic nie przyjmuje, ale zwraca dowolny obiekt (void, T),
Predicate <T> – przyjmuje dowolny obiekt, ale zwraca boolean (T, boolean),
     */

    public static void main(String[] args){

        Predicate<Integer> isAdult = new Predicate<Integer>() {
            @Override
            public boolean test(Integer age) {
                return age >= 18;
            }
        };

        System.out.println(isAdult.test(20));
        System.out.println(isAdult.test(15));


        Supplier<Integer> randomGenerator = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt();
            }
        };

        System.out.println(randomGenerator.get());

        Consumer<String> display = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        display.accept("Hello!");

    }

}
