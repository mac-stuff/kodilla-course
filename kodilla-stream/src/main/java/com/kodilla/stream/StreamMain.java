package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambdaplus.Calculator;
import com.kodilla.stream.lambdaplus.ExpressionExecutor;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> resultStringOfUsers = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'm')
                .filter(user -> user.getDateOfBirth().getYear() < 2000)
                .filter(user -> user.getPostsCounter() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        System.out.println("# elements: " + resultStringOfUsers.size());
        resultStringOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}


//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//        .filter(book -> book.getYearOfPublication() > 2005)
//        .map(Book::toString)
//        .collect(Collectors.joining(",\n", "<<", ">>"));//
//        System.out.println(theResultStringOfBooks);
//
//        People.getList().stream().forEach(System.out::println);
//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("This is an example text."));
//
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//
//        expressionExecutor.executeExpression(3, 4, Calculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, Calculator::multiplyAByB);
//
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify("this is an example text", (text -> text.toUpperCase()));
//        poemBeautifier.beautify("this is an example text", (text -> text.concat(" ❤ ").repeat(3)));
//        poemBeautifier.beautify("this is an example text", (text -> text.replace("this is an", "XD")));
//        poemBeautifier.beautify("this is an example text", (text -> text.replaceAll("an example text", "beautiful code")));
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);

