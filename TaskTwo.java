package com.company;

class TaskTwo {
    private StringBuffer text;

    TaskTwo(StringBuffer text) { this.text = text; }

    void textChange() {
        int i = 0;
        while (i < text.length()) {
            if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
                int start = i;
                while (text.charAt(i) >= '0' && text.charAt(i) <= '9') i++;
                int end = i;
                if (Integer.parseInt(text.substring(start, end)) >= 10 && Integer.parseInt(text.substring(start, end)) <= 99)
                    text.replace(start, end, "+".repeat(Math.max(0, Integer.parseInt(text.substring(start, end)))));
            }
            i++;
        }
    }

    void addWordEnd() {
        int i = 0;
        int minIteration = 0;
        int minLength = text.length();
        int length = 0;
        while (i < text.length()) {
            switch (text.charAt(i)) {
                case '.':
                case '!':
                case '?':
                    if (length < minLength) {
                        minIteration = i;
                        minLength = length;
                        length = 0;
                    }
                    break;
                case '\t':
                case '\n':
                    break;
                default:
                    length++;
                    break;
            }
            i++;
        }
        text.insert(minIteration, " КОНЕЦ");
    }

    void numberReplacement() {
        int i = 0;
        while (i < text.length()) {
            if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
                int start = i;
                while (text.charAt(i) >= '0' && text.charAt(i) <= '9') i++;
                int end = i;
                if (Integer.parseInt(text.substring(start, end)) >= 100 && Integer.parseInt(text.substring(start, end)) <= 999)
                    text.replace(start, end, String.valueOf((new StringBuffer(text.substring(start, end))).reverse()));
            }
            i++;
        }
    }

    void printText() { System.out.println(text.toString()); }
}
