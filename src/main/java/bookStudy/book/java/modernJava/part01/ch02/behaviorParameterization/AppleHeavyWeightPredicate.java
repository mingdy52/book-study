package bookStudy.book.java.modernJava.part01.ch02.behaviorParameterization;

import bookStudy.book.java.modernJava.part01.ch02.exampleClass.Apple;
import bookStudy.book.java.modernJava.part01.ch02.exampleClass.Color;
import lombok.Getter;

@Getter
public class AppleHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
