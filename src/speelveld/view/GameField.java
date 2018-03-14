package speelveld.view;

import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Beelzebub on 12/03/2018.
 */
public class GameField extends GridPane {
    public static final int ROW_LENGTH = 9;
    public static final int COLUMN_LENGTH = 6;
    ArrayList<ImageView> block;

    //private FieldBlock block;

    public GameField() {

        block =  new ArrayList<>();
        layoutnodes();
        initialisatienodes();


    }

    private void initialisatienodes() {
        setHgap(2);
        setVgap(2);
        setAlignment(Pos.CENTER);
        //for testing
        setGridLinesVisible(true);


    }

    //FIX, enkel 9 krijgen een event (door i)
    void layoutnodes() {
        int index = 0;
        for (int i = 0; i < ROW_LENGTH; i++) {

            for (int j = 0; j < COLUMN_LENGTH; j++) {

                block.add(new ImageView("Matrix.jpg"));
                //HBox oneRow = new HBox(blocks[i]);
                //oneRow.setSpacing(10);
                add(block.get(index), i, j);
                index++;

            }
        }

    }


    ArrayList<ImageView> getBlocks() {return block;}
}
