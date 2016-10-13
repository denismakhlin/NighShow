package android.makhlind.nightshow;


import java.util.Random;

public class Predictions {

    public static Predictions predictions;
    private String[] answers;
    public Random rand = new Random();
    public int randInd = 0;

    private Predictions() {
        answers = new String[] {
            "Paul MCcartney - October 27th 2016 - Forum",
                "Jason Derulo - November 24th 2016 - Forum",
                "Ringo Starr - December 15th 2016 - Staples Center",
                "Lil Yachty - October 27th 2016 - Staples Center"
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
