package speelveld.view;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by Beelzebub on 11/03/2018.
 */
public class FieldBlock extends Rectangle {

    public FieldBlock() {
        this.setFill(Color.RED);
        this.setHeight(32);
        this.setWidth(32);
    }

}
