package speelveld.view;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by Beelzebub on 11/03/2018.
 */

public class GameBlock extends Rectangle {

    public GameBlock() {
        this.setFill(Color.BLACK);
        this.setHeight(32);
        this.setWidth(32);
    }

}
