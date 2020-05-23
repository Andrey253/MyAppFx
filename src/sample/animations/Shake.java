package sample.animations;

import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Shake {
    private TranslateTransition tt;

    public Shake (Node node){
        tt = new TranslateTransition(Duration.millis(30), node);
        tt.setFromX(0f);
        //tt.setFromY(-20f);
        tt.setByX(20f);
        //tt.setByX(-20f);
        //tt.setByY(20f);
        tt.setCycleCount(8);
        tt.setAutoReverse(true);
    }

    public void playAmin() {
        tt.playFromStart();
    }
}
