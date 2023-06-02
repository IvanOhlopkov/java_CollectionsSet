package practice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    Set<String> emailSet = new TreeSet<>();

    public boolean add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
        String regex = "[A-Za-z0-9]+@{1}[A-Za-z0-9]+\\.{1}[A-Za-z]{2,3}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean hasCorrect = true;

        if (matcher.find()) {
            emailSet.add(email.toLowerCase(Locale.ROOT));
        } else {
            hasCorrect = false;
        }
        return hasCorrect;
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return emailSet.stream().toList();
    }


}
