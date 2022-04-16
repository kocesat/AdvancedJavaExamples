package com.kocesat.streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show(){
//        List<Movie> movies = List.of(
//                new Movie("a", 10),
//                new Movie("b", 15),
//                new Movie("c", 20)
//        );
//
//        // imperatively (paradigm) count the number of movies that
//        // has the likes greater than 10
//        int count = 0;
//        for (var movie : movies) {
//            if (movie.getLikes() > 10)  {
//                count++;
//            }
//        }
//        System.out.println("Count-imperative: " + count);
//
//        // Java Streams achieve the same result by declarative way
//        // C# LINQ queries
//        var count2 = movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .count();
//
//        System.out.println("Count-declarative: " + count2);

//        // Create stream from ArrayList<>
//        var list = new ArrayList<String>();
//        list.stream();

//        // Create stream from an array
//        int[] numbers = {1, 2, 3, 4};
//        Arrays.stream(numbers)
//                .forEach(n -> System.out.println(n));

//        // Create stream for anonymus values
//        Stream.of(1, 2, 3, 4)
//                .forEach(n -> System.out.println(n));

//        // Create stream for infinite values
//        // Lazy evaluated
//        var stream = Stream.generate(() -> Math.random());
//        stream
//                .limit(5)
//                .forEach(n -> System.out.println(n));

//        // Create stream for infinite values
//        Stream.iterate(1, n -> n + 1)
//                .limit(10)
//                .forEach(n -> System.out.println(n));

//        //Map
//        List<Movie> movies = List.of(
//                new Movie("a", 10),
//                new Movie("b", 15),
//                new Movie("c", 20)
//        );
//
//        movies.stream()
//                .map(movie -> movie.getTitle())
//                .forEach(name -> System.out.println(name));
//

//        // Flat map
//        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
//        stream
//                .flatMap(list -> list.stream()) // if flattens stream of list of objects to a stream of objects
//                .forEach(n -> System.out.println(n));

//        // Filtering
//        List<Movie> movies = List.of(
//        new Movie("a", 10),
//        new Movie("b", 15),
//        new Movie("c", 20));
//
//        Predicate<Movie> isPopular = m -> m.getLikes() > 10;
//        movies.stream()
//                .filter(isPopular) // Intermediate operations
//                .forEach(m -> System.out.println(m.getTitle())); // Terminal operations

        // Slicing Streams
        // limit(n), skip(n), takeWhile, dropWhile
        List<Movie> movies = List.of(
            new Movie("b", 7, Genre.ACTION),
            new Movie("a", 30, Genre.THRILLER),
            new Movie("c", 18, Genre.COMEDY),
            new Movie("d", 30, Genre.COMEDY)
        );
//        movies.stream()
//                .skip(2)
//                .limit(1)
//                .forEach(m -> System.out.println(m.getTitle()));

//        movies.stream()
//                .takeWhile(m -> m.getLikes() < 30)
//                .forEach(m -> System.out.println(m.getTitle()));

//        movies.stream()
//                .dropWhile(m -> m.getLikes() < 20)
//                .forEach(m -> System.out.println(m.getTitle()));

//        // Sorting Streams by Class's compareTo() method
//        movies.stream()
//                .sorted()
//                .forEach(m -> System.out.println(m.getTitle()));

//        // Sorting by a Comparator object
//        movies.stream()
////                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
//                .sorted(Comparator.comparing(Movie::getTitle).reversed())
//                .forEach(m -> System.out.println(m.getTitle()));

//        // Get unique values
//        movies.stream()
//                .map(Movie::getLikes)
//                .distinct()
//                .forEach(like -> System.out.println(like));

//        // Peeking elements for troubleshooting problems
//        movies.stream()
//                .filter(m -> m.getLikes() > 10)
//                .peek(m -> System.out.println("Filtered: " + m.getTitle()))
//                .map(Movie::getTitle)
//                .peek(str -> System.out.println("Mapped: " + str))
//                .forEach(System.out::println);

//        // Reducers are terminal operators
//        // count(), anyMatch(), allMatch(), findFirst(), max(), min()
//        var result = movies.stream()
//                .anyMatch(m -> m.getLikes() > 20);
//        System.out.println(result);

//        var result = movies.stream()
//                .findFirst()
//                .get();
//        System.out.println(result);

//        var result = movies.stream()
//                .max(Comparator.comparing(Movie::getLikes))
//                .get();
//        System.out.println(result.getTitle());

//        // Reducing continued
//        // Sum
//        Optional<Integer> sum = movies.stream()
//                .map(Movie::getLikes)
////                .reduce(Integer::sum)
//                .reduce((a, b) -> a + b);
//        System.out.println(sum.orElse(0));

//        // Collectors
//        var result = movies.stream()
//                .filter(m -> m.getLikes() > 10)
//                .collect(Collectors.toList());
//
//        var resultMap = movies.stream()
//                .filter(m -> m.getLikes() > 10)
//                .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));
//        System.out.println(resultMap);

//        // Grouping Elemets
//        var result = movies.stream()
//                .collect(Collectors.groupingBy(
//                        Movie::getGenre, Collectors.counting()));
//
//        System.out.println(result);

        // Partioning
        var result = movies.stream()
                .collect(Collectors.partitioningBy(
                        m -> m.getLikes() > 10,
                        Collectors.mapping(Movie::getTitle,
                                Collectors.joining(", "))));
        System.out.println(result);

    }
}

















