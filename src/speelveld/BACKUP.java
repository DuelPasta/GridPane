/**
public class BACKUP {

            new BlockView();
    GridPane speelVeld = new GridPane();
    GridPane blok = new GridPane();

        speelVeld.setHgap(10);
        speelVeld.setVgap(10);

        blok.setHgap(10);
        blok.setVgap(10);

    Rectangle r1 = new Rectangle(32,32);
    Rectangle r2 = new Rectangle(32,32);
    Rectangle r3 = new Rectangle(32,32);
    Rectangle r4 = new Rectangle(32,32);
    Rectangle r5 = new Rectangle(32,32);
    Rectangle r6 = new Rectangle(32,32);

        r1.setFill(Color.RED);
        r2.setFill(Color.RED);
        r3.setFill(Color.RED);
        r4.setFill(Color.RED);
        r5.setFill(Color.RED);
        r6.setFill(Color.RED);

    Rectangle r7 = new Rectangle(32,32);
    Rectangle r8 = new Rectangle(32,32);
    Rectangle r9 = new Rectangle(32,32);
    Rectangle r10 = new Rectangle(32,32);
    Rectangle r11 = new Rectangle(32,32);
    Rectangle r12 = new Rectangle(32,32);

        speelVeld.add(r1, 0, 0, 1, 1);
        speelVeld.add(r2, 0, 1, 1, 1);
        speelVeld.add(r3, 0, 2, 1, 1);
        speelVeld.add(r4, 1, 0, 1, 1);
        speelVeld.add(r5, 1, 1, 1, 1);
        speelVeld.add(r6, 1, 2, 1, 1);

        blok.add(r7, 0, 0, 1, 1);
        blok.add(r8, 0, 1, 1, 1);
        blok.add(r9, 1, 0, 1, 1);
        blok.add(r10, 1, 1, 1, 1);
        blok.add(r11, 2, 0, 1, 1);
        blok.add(r12, 2, 1, 1, 1);




    //gridpane.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
    //   e.getX();
    //   e.getY();
    //And if applicable
    //     e.getZ();
    // });

    //    r1.setStyle("-fx-background-color-color: red");
    //     r1.setStyle("-fx-border-color: black");

    BorderPane bp = new BorderPane();

        bp.setCenter(speelVeld);
        bp.setBottom(blok);

    Scene scene = new Scene(bp);
        primaryStage.setTitle("Wooden Block Puzzle");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
}
**/