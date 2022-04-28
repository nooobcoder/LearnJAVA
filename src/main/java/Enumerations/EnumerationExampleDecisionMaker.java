package main.java.Enumerations;

import java.util.Random;

// An enumeration of the possible answers
enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER;
}

class Question {
    Random random = new Random();

    Answers ask() {
        int prob = (int) (100 * random.nextDouble());

        if (prob < 15)
            return Answers.MAYBE;
        else if (prob < 30) return Answers.NO;
        else if (prob < 60) return Answers.YES;
        else if (prob < 75) return Answers.LATER;
        else if (prob < 98) return Answers.SOON;
        else return Answers.NEVER;
    }
}

class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO -> System.out.println("No");
            case YES -> System.out.println("Yes");
            case MAYBE -> System.out.println("Maybe");
            case LATER -> System.out.println("Later");
            case SOON -> System.out.println("Soon");
            case NEVER -> System.out.println("Never");
        }
    }
}

public class EnumerationExampleDecisionMaker {
    public static void main(String[] args) {
        Question q = new Question();
        AskMe.answer(q.ask());
        AskMe.answer(q.ask());
        AskMe.answer(q.ask());
        AskMe.answer(q.ask());
    }
}
