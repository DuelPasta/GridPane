package speelveld.view;

import javafx.scene.layout.BorderPane;


/**
 * Created by Beelzebub on 12/03/2018.
 */
public class WoodenBlockPuzzleView extends BorderPane {

    private BlockView blockView;
    private BlockViewPresenter blockViewpresenter;
    private GameField gameField;
    private GameFieldPresenter gameFieldPresenter;

    public WoodenBlockPuzzleView() {
        initialisatieNodes();
        layoutnodes();
    }

    private void initialisatieNodes() {
        blockView = new BlockView();
        blockViewpresenter = new BlockViewPresenter(blockView);
        gameField = new GameField();
        gameFieldPresenter = new GameFieldPresenter(gameField);

    }

    private void layoutnodes() {
        setCenter(gameField);
        setBottom(blockView);
    }


}


