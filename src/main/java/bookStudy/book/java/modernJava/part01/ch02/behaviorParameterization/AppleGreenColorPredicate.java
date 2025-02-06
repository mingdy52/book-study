package bookStudy.book.java.modernJava.part01.ch02.behaviorParameterization;

import bookStudy.book.java.modernJava.part01.ch02.exampleClass.Apple;
import lombok.Getter;

import static bookStudy.book.java.modernJava.part01.ch02.exampleClass.Color.GREEN;

@Getter
public class AppleGreenColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return GREEN.equals(apple.getColor());
    }
}
