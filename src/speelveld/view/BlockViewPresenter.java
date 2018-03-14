package speelveld.view;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
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

        for (ImageView source : view.getBlocks()) {
                source.setOnDragDetected(event -> {
                    Dragboard db = source.startDragAndDrop(TransferMode.MOVE);
                    ClipboardContent content = new ClipboardContent();
                    content.putImage(source.getImage());
                    db.setContent(content);
                    event.consume();
                    System.out.println("drag");

                });
            }
        for (ImageView source : view.getBlocks()) {
            source.setOnDragDone(event -> {
                if (event.getTransferMode() == TransferMode.MOVE) {
                    source.setImage(null);
                }
                event.consume();
            });
        }
    }
}
