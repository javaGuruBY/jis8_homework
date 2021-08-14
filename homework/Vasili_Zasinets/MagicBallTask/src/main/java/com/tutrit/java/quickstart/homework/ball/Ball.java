package com.tutrit.java.quickstart.homework.ball;

public enum Ball {

    PREDICT0("It is certain"),
    PREDICT1("It is decidedly so"),
    PREDICT2("Without a doubt"),
    PREDICT3("Yes — definitely"),
    PREDICT4("You may rely on it"),
    PREDICT5("As I see it,yes"),
    PREDICT6("Most likely"),
    PREDICT7("Outlook good"),
    PREDICT8("Signs point to yes"),
    PREDICT9("Yes"),
    PREDICT10("Reply hazy,try again"),
    PREDICT11("Ask again later"),
    PREDICT12("Better not tell you now"),
    PREDICT13("Cannot predict now"),
    PREDICT14("Don’t count on it"),
    PREDICT15("My reply is no"),
    PREDICT16("My sources say no"),
    PREDICT17("Outlook not so good"),
    PREDICT18("Very doubtful"),
    PREDICT19("Concentrate and ask again");

    private final String predict;

    Ball(String predict) {
        this.predict = predict;
    }

    @Override
    public String toString() {
        return predict;
    }
}
