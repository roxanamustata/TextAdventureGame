package game.controller;

import game.model.Door;
import game.model.Game;
import game.model.Key;
import game.model.Player;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.xml.bind.SchemaOutputResolver;

public class Controller {


    public TextField txtFieldCommand;
    public TextArea txtAreaGameOutput;

    private Game game;


    public void initialize(){
        System.out.println("test");
        game=new Game(10);

        Key key =new Key();
        Door door=new Door(key);
        Player player = new Player();

        game.placeOnBoard(key,2,2 );
        game.placeOnBoard(door, 1, 5);
        game.placeOnBoard(player, 5, 5);

        System.out.println(game.displayBoard());

    }


}
