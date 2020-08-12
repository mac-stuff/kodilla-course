package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambdaplus.Calculator;
import com.kodilla.stream.lambdaplus.ExpressionExecutor;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);

        expressionExecutor.executeExpression(3, 4, Calculator::addAToB);
        expressionExecutor.executeExpression(3, 4, Calculator::multiplyAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("this is an example text", (text -> text.toUpperCase()));
        poemBeautifier.beautify("this is an example text", (text -> text.concat(" ❤ ").repeat(3)));
        poemBeautifier.beautify("this is an example text", (text -> text.replace("this is an", "XD")));
        poemBeautifier.beautify("this is an example text", (text -> text.replaceAll("an example text", "beautiful code")));
    }
}
