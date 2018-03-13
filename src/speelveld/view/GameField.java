package speelveld.view;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import java.lang.reflect.Field;

/**
 * Created by Beelzebub on 12/03/2018.
 */
public class GameField extends GridPane {
    public static final int ROW_LENGTH = 9;
    private FieldBlock[] blocks;

    public GameField() {
        blocks = new FieldBlock[ROW_LENGTH];
        layoutnodes();
        initialisatienodes();

    }

    private void initialisatienodes() {
        setHgap(20);
        setVgap(20);
        //for testing
        setGridLinesVisible(true);


    }

    //FIX, enkel 9 krijgen een event (door i)
    void layoutnodes() {
        for (int i = 0; i < ROW_LENGTH; i++) {
            for (int j = 0; j < 6; j++) {

                blocks[i] = new FieldBlock();
                HBox oneRow = new HBox(blocks[i]);
                oneRow.setSpacing(10);
                add(oneRow, i, j);

            }
        }
    }

    FieldBlock[] getBlocks() {return blocks;}

}
