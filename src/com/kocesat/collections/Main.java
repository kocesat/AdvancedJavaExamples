package com.kocesat.collections;

import com.kocesat.generics.GenericList;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        var list = new GenericList<String>();
//        list.add("a");
//        list.add("b");
//        for (var item: list) {
//            System.out.println(item);
//        }
//        Collection<String> collection = new ArrayList<>();
//        collection.add("a");
//        collection.add("b");
//        collection.add("c");
//        Collections.addAll(collection, "a", "b", "c");
//        collection.remove("a");
//        System.out.println(collection.size());
//        for (var item : collection) {
//            System.out.println(item);
//        }
//        var stringArray = collection.toArray(new String[0]);
//        for (var item : stringArray) {
//            System.out.println(item);
//        }
//
//        Collection<String> other = new ArrayList<>();
//        other.addAll(collection);
//
//        System.out.println(collection.equals(other));
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add(0, "!");
//        System.out.println(list);
//        System.out.println(list.get(0));
//        list.set(0, "a+");
//        System.out.println(list);

//        List<Customer> customers = new ArrayList<>();
//        customers.add(new Customer("az", "e3"));
//        customers.add(new Customer("bz", "e2"));
//        customers.add(new Customer("cz", "e1"));
//        Collections.sort(customers);
//        System.out.println(customers);
//        Collections.sort(customers, new EmailComparator());
//        System.out.println(customers);

//        Queue<String> queue = new ArrayDeque<>();
//        queue.add("c");
//        queue.add("a");
//        queue.add("b"); // add method throws an exception in some impl.
//        queue.offer("d");
//        var front = queue.element();
//        queue.remove();
//        System.out.println(queue);

//        Set<String> set = new HashSet<>();
//        set.add("sky");
//        set.add("is");
//        set.add("blue");
//        set.add("blue");

//        Collection<String> collection = new ArrayList<>();
//        Collections.addAll(collection, "a", "b", "c", "c");
//        Set<String> set = new HashSet<>(collection);
//        System.out.println(set);
//        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
//        Set<String> set2 = new HashSet<>(Arrays.asList("d", "b", "c"));

//        // Union
//        set1.addAll(set2);
//        System.out.println(set1);

//        // Intersection
//        set1.retainAll(set2);
//        System.out.println(set1);

//        // Difference
//        set1.removeAll(set2);
//        System.out.println(set1);

//        // Cost: O(n) - O(10)
//        List<Customer> customers = new ArrayList<>();
//        for (var customer : customers) {
//            if (customer.getEmail() == "e1")
//                System.out.println("Found");
//        }
//        // Hash Table uses hash and look fast
        // Java: Maps
        // C#: Dictionary
        // Python: Dİctionary
        // Javascript: Objects

//        var c1 = new Customer("a", "e1");
//        var c2 = new Customer("b", "e2");
//        Map<String, Customer> map = new HashMap<>();
//        map.put(c1.getEmail(), c1);
//        map.put(c2.getEmail(), c2);
//        var customer = map.get("e1");
//        var exists = map.containsKey("e2");
//        System.out.println(exists);

    }
}
