package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(01, "Tyrion Lannister",
                'm', LocalDate.of(1972, 1, 8), 14));
        usersList.add(new ForumUser(02, "Cersei Lannister",
                'f', LocalDate.of(1978, 2, 18), 15));
        usersList.add(new ForumUser(03, "Daenerys Targaryen",
                'f', LocalDate.of(1983, 6, 13), 12));
        usersList.add(new ForumUser(04, "Jon Snow",
                'm', LocalDate.of(1981, 12, 5), 4));
        usersList.add(new ForumUser(05, "Sansa Stark",
                'f', LocalDate.of(1985, 11, 7), 3));
        usersList.add(new ForumUser(06, "Arya Stark",
                'f', LocalDate.of(2002, 5, 8), 7));
        usersList.add(new ForumUser(07, " Jaime Lannister",
                'm', LocalDate.of(1978, 9, 17), 2));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(usersList);
    }
}
