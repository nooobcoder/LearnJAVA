package main.java.Inheritance.Interfaces;

import java.util.Random;

interface sharedConstants {
    // Interface allows, variable declarations and definitions at the same time but it is not in the case of functions
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}

class Question implements sharedConstants {
    Random rand = new Random();

    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30)
            return NO; // 30%
        else if (prob < 60)
            return YES;  // 30%
        else if (prob < 75)
            return LATER; // 15%
        else if (prob < 98) //13
            return SOON;
        else
            return NEVER; // 2%
    }
}

class AskMe implements sharedConstants {
    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("NO");
                break;
            case YES:
                System.out.println("YES");
                break;
            case MAYBE:
                System.out.println("MAYBE");
                break;
            case LATER:
                System.out.println("LATER");
                break;
            case SOON:
                System.out.println("SOON");
                break;
            case NEVER:
                System.out.println("NEVER");
                break;
            default:
        }
    }

    public static void main(String[] args) {
        Question question=new Question();

        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
    }
}
