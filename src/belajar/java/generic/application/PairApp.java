package belajar.java.generic.application;

import belajar.java.generic.Pair;

public class PairApp {
    public static void main(String[] args) {

        Pair<Integer, String, String> pair = new Pair<>(13, "Rigan Nur Fauzi", "18 years old");

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair.getThird());

    }
}
