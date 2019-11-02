package com.company;

import java.util.TreeMap;

class TaskOne {
    private String text;
    private String[] array;
    private TreeMap<Object, Integer> list;

    TaskOne(String text) { this.text = text; }

    void wordConversion() { text = text.toLowerCase(); }

    void wordsFormationArray() { array = text.split("[\\s.,!?;:]+"); }

    void occurrenceFormationArray() {
        list = new TreeMap<>();
        int count = 0;
        for (String o: array) {
            if (list.containsKey(o)) {
                count = list.get(o) + 1;
                list.put(o, count);
            } else list.put(o, 1);
        }
    }

    int wordsPrefixFind(String str) {
        int count = 0;
        for (String o: array)
            if (o.startsWith(str))
                count++;
        return count;
    }

    void printText() { System.out.println(this.text); }

    void printArray() {
        for (String o: array)
            System.out.print(o + ' ');
        System.out.println();
    }

    void printArrayOccurrence() { System.out.println(list); }
}
