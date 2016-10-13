package android.makhlind.nightshow;


import java.util.Random;

public class Predictions {

    public static Predictions predictions;
    private String[] answers;
    public Random rand = new Random();
    public int randInd = 0;

    private Predictions() {
        answers = new String[] {
            "Your wishes will come true.",
                "Your wishes will NEVER come true.",
                "yoooo",
                "test"
        };
    }

    public static Predictions get() {
        if(predictions == null) {
            predictions = new Predictions();
        }
        return predictions;
    }

    public String getPrediction() {
        randInd = rand.nextInt(answers.length);
        return answers[randInd];
    }
}
