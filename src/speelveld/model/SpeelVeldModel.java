package speelveld.model;

/**
 * Created by Beelzebub on 11/03/2018.
 */
public class SpeelVeldModel {
    private fieldState state;

    public fieldState getState() {return state;}
    public void setState(fieldState state) { this.state = state;}

    public void updateGameState() {
        if ((getState() == fieldState.EMPTY))
            setState(fieldState.FILLED);
        else
            setState(fieldState.EMPTY);

        System.out.println("GameModel\t\t: Just changed the gamestate to : " + state + ".");
    }

    public SpeelVeldModel(){
        this.setState(state.EMPTY);
        System.out.println("State set to EMPTY");
    }

}
