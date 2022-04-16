package com.kocesat.lambdaexpressions;

import java.util.List;
import java.util.function.*;

public class Program {
    public static void main(String[] args) {
//        LambdasDemo.show();

//         Built in functional Interfaces
//         Consumer
//         Supplier
//         Function
//         Predicate

//        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
//        Predicate<String> hasRightBrace = str -> str.endsWith("}");
//        Predicate<String> hasRightOrLeftBraces = hasLeftBrace.or(hasRightBrace);
//        var result = hasRightOrLeftBraces.test("{Am i too old?");
//        System.out.println(result);

//        Function<String, Integer> getLength = str -> str.length();
//        List<String> list = List.of("üç", "dört", "beş");
//        var newListOfLengths = list.stream().map(getLength);
//        newListOfLengths.forEach(num -> System.out.println(num));

//        // a, b -> a + b -> square
//        BinaryOperator<Integer> add = (a, b) -> a + b;
//        Function<Integer, Integer> square = a -> a * a;
//        var result = add.andThen(square).apply(1, 2);
//        System.out.println(result);

        // Uniary Operator
        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;
        var result = increment.andThen(square).apply(1);
        System.out.println(result);
    }
}
