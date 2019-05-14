// Author: Amy Zhang

package HW3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class MakingUnicorns extends Application{
  public void start(Stage circlesStage){
    
    //creating two instances of the template class
    Unicorns scene1 = new Unicorns(400, 400); 
    Unicorns scene2 = new Unicorns(400, 400); 
    
    // using makeUnicorn method
    Group unicorn1 = scene1.makeUnicorn("Beans", Color.GREEN, Color.web("#EEDD82"));
    Group unicorn2 = scene2.makeUnicorn("Bubbles", Color.web("#FFB6C1"), Color.RED);
    unicorn2.setLayoutX(400.0);
    unicorn2.setLayoutY(0.0);
    
    // using toString and accessor method
    Text aboutUnicorn1 = new Text(130, 340, "" + scene1);
    Text unicorn1Worth = new Text(70, 360, "" + scene1.getWorth());
    
    Text aboutUnicorn2 = new Text(530, 340, "" + scene2);
    Text unicorn2Worth = new Text(470, 360, "" + scene2.getWorth());
    
    // using mutator methods
    scene1.setBodyColor(Color.web("#87CEFA"));
    scene2.setHornColor(Color.web("#EED5B7"));
    
    // using mutator method again
    scene2.setName("Yeet");
    aboutUnicorn2 = new Text(530, 340, "" + scene2);
    
    // grouping them into the scene
    Group unis = new Group(unicorn1, unicorn2, aboutUnicorn1, unicorn1Worth, aboutUnicorn2, unicorn2Worth);
    Scene setScene = new Scene(unis, 800, 400);
    
    circlesStage.setTitle("Let's Make Some Unicorns!");
    circlesStage.setScene(setScene);
    circlesStage.show();
  }
  
  public static void main(String[] args){
    launch(args);
  }
}