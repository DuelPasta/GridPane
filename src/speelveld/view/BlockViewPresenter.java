package speelveld.view;

import javafx.event.EventHandler;
import javafx.scene.input.*;
import javafx.scene.input.TransferMode;
import javafx.scene.shape.Rectangle;
import speelveld.model.SpeelVeldModel;

/**
 * Created by Beelzebub on 12/03/2018.
 */
public class BlockViewPresenter {

    private BlockView view;

    public BlockViewPresenter(BlockView view) {

        this.view = view;
        this.addEventHandlers();
        this.upDateView();

    }

    private void upDateView() {

    }

    //TODO
    private void addEventHandlers() {

        for (GameBlock blocks : view.getBlocks()) {
                blocks.setOnDragDetected(event -> {
                    event.consume();
                    System.out.println("drag");
                });
            }

        for (GameBlock blocks : view.getBlocks()) {
            blocks.setOnDragEntered(event -> {
                event.consume();
                System.out.println("Clcik");
            });
        }
    }
}
