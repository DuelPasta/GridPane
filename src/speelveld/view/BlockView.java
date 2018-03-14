package speelveld.view;

import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

/**
 * Created by Beelzebub on 12/03/2018.
 * Toont bepaald aantal blokken
 */
public class BlockView extends GridPane {
    public static final int BLOCK_PIECES = 3;
    //private GameBlock[] blocks;
    private ImageView[] blocks;

    public BlockView() {
        blocks = new ImageView[BLOCK_PIECES];
        layoutnodes();
        initialisatienodes();


    }

    private void initialisatienodes() {

        setAlignment(Pos.CENTER);
        setHgap(30);
        //for testing
        setGridLinesVisible(true);
    }


    void layoutnodes() {
        for (int i = 0; i < blocks.length; i++) {
            blocks[i] = new ImageView("Block.jpg");
            add(blocks[i], i, 0);

        }
    }

    ImageView[] getBlocks() {return blocks;}
}
