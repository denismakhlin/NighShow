package android.makhlind.nightshow;


public class Predictions {

    public static Predictions predictions;
    private String[] answers;

    private Predictions() {
        answers = new String[] {
            "Your wishes will come true.",
                "Your wishes will NEVER come true."
        };
    }

    public static Predictions get() {
        if(predictions == null) {
            predictions = new Predictions();
        }
        return predictions;
    }

    public String getPrediction() {
        return answers[1];
    }
}
