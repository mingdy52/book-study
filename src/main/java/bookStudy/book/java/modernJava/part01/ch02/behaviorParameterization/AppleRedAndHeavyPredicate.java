package bookStudy.book.java.modernJava.part01.ch02.behaviorParameterization;

import bookStudy.book.java.modernJava.part01.ch02.exampleClass.Apple;
import lombok.Getter;

import static bookStudy.book.java.modernJava.part01.ch02.exampleClass.Color.RED;

@Getter
public class AppleRedAndHeavyPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return RED.equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
