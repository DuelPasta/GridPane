package speelveld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import speelveld.view.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {


        WoodenBlockPuzzleView view = new WoodenBlockPuzzleView();
        primaryStage.setScene(new Scene(view));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
