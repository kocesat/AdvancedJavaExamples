package com.kocesat.generics;

public class Main {
    public static void main(String[] args) {
//        var list = new List();
//        list.add(1);

//        var list = new GenericList<Integer>();
//        list.add(1);
//        int number = list.get(0);

//        var numbers = new GenericList<Integer>();
//        numbers.add(1); // Boxing
//        int number = numbers.get(0); // Unboxing

//        var user1 = new User(10);
//        var user2 = new User(20);
//        if (user1.compareTo(user2) < 0)
//            System.out.println("user1 < user2");
//        else if (user1.compareTo(user2) > 0)
//            System.out.println("user1 > user2");
//        else
//            System.out.println("user1 = user2");
//
//        var bigger = Utils.max(2, 10);
//        System.out.println(bigger);
//        var max = Utils.max(user1, user2);
//        System.out.println(max);
//
//        Utils.print(1, 10);

//        User user = new Instructor(10);
//        Utils.printUser(new Instructor(10));

        // MOST CONFUSED TOPIC: WILDCARDS <?> IN GENERICS
        var users = new GenericList<Instructor>();
        var instructors = new GenericList<User>();
        users.add(new Instructor(20));
        users.add(new Instructor(30));

        // printUsers(GenericList<? extends User> users)
        // Use "? extends User" to read from the list
        // Cannot be written to the list
        Utils.printUsers(users);

        // addUsers(GenericList<? super User> users)
        // Use "? super User" to read from the list
        // Cannot be read from the list
        Utils.addUserToList(new Instructor(22), instructors);
        Utils.printUsers(instructors);
    }
}
