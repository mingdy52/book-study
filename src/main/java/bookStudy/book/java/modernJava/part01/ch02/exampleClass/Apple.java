package bookStudy.book.java.modernJava.part01.ch02.exampleClass;

import lombok.Getter;

@Getter
public class Apple {

    Color color;
    int weight;

    public Apple(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }
}
