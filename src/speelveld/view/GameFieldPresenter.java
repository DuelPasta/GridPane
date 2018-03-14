package speelveld.view;

import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DataFormat;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.shape.Rectangle;

/**
 * Created by Beelzebub on 13/03/2018.
 */
public class GameFieldPresenter {
    private GameField view;

    public GameFieldPresenter(GameField view) {

        this.view = view;

        this.addEventHandlers();
        this.upDateView();
    }

    private void upDateView() {

    }

    //TODO
    private void addEventHandlers() {

        for (ImageView target : view.getBlocks()) {

            target.setOnDragOver(event -> {
                System.out.println("OnDragDetected");
                if (event.getGestureSource() != target &&
                        event.getDragboard().hasImage()) {
                    event.acceptTransferModes(TransferMode.MOVE);
                }
                event.consume();
            });
        }

        for (ImageView target : view.getBlocks()) {

            target.setOnDragDropped(event -> {
                Dragboard db = event.getDragboard();
                boolean success = false;
                if (db.hasImage()) {

                 target.setImage(db.getImage());

                    event.setDropCompleted(success);
                }
                event.consume();
            });
        }

    }
}