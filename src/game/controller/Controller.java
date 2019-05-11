package game.controller;

import game.model.*;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import javax.xml.bind.SchemaOutputResolver;

public class Controller {


    public TextField txtFieldCommand;
    public TextArea txtAreaGameOutput;

    private Game game;
    private Player player;


    public void initialize(){
        player = new Player();
        System.out.println("test");
        game=new Game(10);

        Key key =new Key();
        Door door=new Door(key);

        game.placeOnBoard(key,2,2 );
        game.placeOnBoard(door, 1, 5);
        game.placeOnBoard(player, 5, 5);
        txtAreaGameOutput.appendText(game.displayBoard());

//        System.out.println(game.displayBoard());
//
//        game.removeFromBoard(2,2);
//        System.out.println(game.displayBoard());
//        txtAreaGameOutput.appendText(game.displayBoard());
//
//        game.placeOnBoard(key, 2,3);
//        game.movePlayer(player, 2,3);
//        System.out.println(game.displayBoard());
//        txtAreaGameOutput.appendText(game.displayBoard());
//        System.out.println(player.getArtifacts());
//        txtAreaGameOutput.appendText(player.getArtifacts());
//
//        game.movePlayer(player,1,5);
//        System.out.println(game.displayBoard());
//        txtAreaGameOutput.appendText(game.displayBoard());
//        System.out.println(player.getArtifacts());
//        txtAreaGameOutput.appendText(player.getArtifacts());

    }


    public void processCommand(KeyEvent keyEvent) {
        if(keyEvent.getCode().equals(KeyCode.ENTER)){
            GameStrategy.processCommand(txtFieldCommand.getText(), game, player);
            txtFieldCommand.clear();
            txtAreaGameOutput.appendText(game.displayBoard()+"\n");
        }
    }
}
