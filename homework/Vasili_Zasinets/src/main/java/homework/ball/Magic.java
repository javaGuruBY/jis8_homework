package homework.ball;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Random;

public class Magic {
    Logger log = LoggerFactory.getLogger("Magic Ball ");
    HashMap<Integer, String> ball = new HashMap<>();
    Random random = new Random();

    @Override
    public String toString() {
        return "Magic{" +
                "ball=" + ball +
                '}';
    }

    void addPrediction() {
        ball.put(1, "It is certain");
        ball.put(2, "It is decidedly so");
        ball.put(3, "Without a doubt");
        ball.put(4, "Yes — definitely");
        ball.put(5, "You may rely on it");
        ball.put(6, "As I see it,yes");
        ball.put(7, "Most likely");
        ball.put(8, "Outlook good");
        ball.put(9, "Signs point to yes");
        ball.put(10, "Yes");
        ball.put(11, "Reply hazy,try again");
        ball.put(12, "Ask again later");
        ball.put(13, "Better not tell you now");
        ball.put(14, "Cannot predict now");
        ball.put(15, "Don’t count on it");
        ball.put(16, "My reply is no");
        ball.put(17, "My sources say no");
        ball.put(18, "Outlook not so good");
        ball.put(19, "Very doubtful");
        ball.put(20, "Concentrate and ask again");
    }

    int number() {
        return random.nextInt(21);
    }

    void prediction() {
        log.info("Prediction fo you {}", ball.get(number()));
    }

}
