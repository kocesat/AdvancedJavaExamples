package com.kocesat.generics;

public class Utils {

    public static <T extends Comparable<T>> T max(T first, T second) {
        return first.compareTo(second) > 0 ? first : second;
    }

    public static <K, V> void print(K key, V value) {
        System.out.println(key + "=" + value);
    }

    public static void printUser(User user) {
        System.out.println(user);
    }

    public static void printUsers(GenericList<? extends User> users) {
        for (int i = 0; i < users.getCount(); i++) {
            System.out.println(users.get(i));
        }
    }

    public static void addUserToList(User user, GenericList<? super User> users) {
        users.add(user);
    }
}
