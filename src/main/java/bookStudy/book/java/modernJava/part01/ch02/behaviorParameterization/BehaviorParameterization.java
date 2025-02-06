package bookStudy.book.java.modernJava.part01.ch02.behaviorParameterization;

import bookStudy.book.java.modernJava.part01.ch02.exampleClass.Apple;
import bookStudy.book.java.modernJava.part01.ch02.exampleClass.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BehaviorParameterization {
    /*
         ApplePredicate (알고리즘 패밀리)
            L AppleHeavyWeightPredicate (전략)
            L AppleGreenColorPredicate (전략)


         런타임에 어떤 프레디케이트가 선택되냐에 따라 다르게 동작한다. (전략 패턴)
            * 전략 패턴: 각 알고리즘(전략)을 캡슐화하는 알고리즘 패밀리를 정의해둔 다음에 런타임에 알고리즘을 선택하는 기법.
    */

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(Color.RED, 150)
                , new Apple(Color.GREEN, 160)
                , new Apple(Color.RED, 120)
                , new Apple(Color.GREEN, 110)
        );

        List<Apple> filteredApples = filterApples(apples, new AppleHeavyWeightPredicate());
        // filterApples 의 동작(전략)을 파라미터화 한 것!
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if(p.test(apple)){ // 프레디케이트 객체로 사과 검사 조건을 캡슐화
                result.add(apple);
            }
        }

        return result;
    }

    /*
        컴렉션 탐색 로직과 각 항목에 적용할 동작을 분리할 수 있다는 것이 동작 파라미터화의 강점이다.
        매번 객체를 만들기 힘들다. test() 를 객체로 감싸지 않고 전달할 수 없을까?
            => 람다!
    */

}
