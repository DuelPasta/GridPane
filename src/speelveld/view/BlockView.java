package speelveld.view;

import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

/**
 * Created by Beelzebub on 12/03/2018.
 * Toont bepaald aantal blokken
 */
public class BlockView extends GridPane {
    public static final int BLOCK_PIECES = 3;
    private GameBlock[] blocks;

    public BlockView() {
        blocks = new GameBlock[BLOCK_PIECES];
        layoutnodes();
        setHgap(30);
        //for testing
        setGridLinesVisible(true);

    }

    void layoutnodes() {
        for (int i = 0; i < blocks.length; i++) {
            blocks[i] = new GameBlock();
            add(blocks[i], i, 0);

        }
    }

    GameBlock[] getBlocks() {return blocks;}
}
