package speelveld.view;

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

        // GameBlock[] source = view.getBlocks();

        //   for (int i = 0; i < source.length; i++) {
        for (FieldBlock blocks : view.getBlocks()) {
            blocks.setOnDragDetected(event -> {
                event.consume();
                System.out.println("drag");
            });
        }

        for (FieldBlock blocks : view.getBlocks()) {
            blocks.setOnDragEntered(event -> {
                event.consume();
                System.out.println("Clcik");
            });
        }
    }
}
