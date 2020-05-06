package customs;

import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Anim {
    public void basicAnim(Node n) {
        FadeTransition ft = new FadeTransition(Duration.millis(1000), n);
        ft.setFromValue(0.0);
        ft.setToValue(0.9);
        ft.play();
    }

}