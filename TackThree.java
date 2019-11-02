package com.company;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TackThree {
    private String[] email = {"\\w+?@yandex\\.ru", "\\w+?@narod\\.ru", "\\w+?@ya\\.ru", "\\w+?@yandex\\.com",
            "\\w+?@yandex\\.ua", "\\w+?@yandex\\.kz", "\\w+?@yandex\\.by", "\\w+?@mail\\.ru", "\\w+?@list\\.ru",
            "\\w+?@inbox\\.ru", "\\w+?@bk\\.ru", "\\w+?@gmail\\.com"};

    String complianceCheck(String text) {
        for (String s : email) if (Pattern.matches(s, text)) return "Корректный e-mail";
        return "Некорректный e-mail";
    }

    ArrayList <String> listBuilding(String text) {
        ArrayList <String> list = new ArrayList<>();
        Pattern pattern;
        Matcher matcher;
        for (String s: email) {
            pattern = Pattern.compile(s);
            matcher = pattern.matcher(text);
            while (matcher.find()) {
                list.add(text.substring(matcher.start(), matcher.end()));
            }
        }
        return list;
    }
}
