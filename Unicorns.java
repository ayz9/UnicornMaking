// Author: Amy Zhang
// This is my most ambitious program yet. I'm not expecting extra credit or anything I just wanted to see if I could do it

package HW3;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

import java.util.Random;

public class Unicorns{
  private int width;
  private int height;
  private String name;
  private Color bodyColor;
  private Color hornColor;
  private double worth;
  
  // for the body and horn to be changed
  private Circle body;
  private Ellipse ear1, ear2;
  private Line hornA, hornB, hornC;
  
  public Unicorns(int sceneWidth, int sceneHeight){
    width = sceneWidth;
    height = sceneHeight;
  }
  
  public Group makeUnicorn(String setName, Color setBodyColor, Color setHornColor){
    name = setName;
    bodyColor = setBodyColor;
    hornColor = setHornColor;
    
    // making the unicorn
    body = new Circle(200, 200, 100);
    body.setFill(bodyColor);
    
    Circle tummy = new Circle(200, 235, 60);
    tummy.setFill(Color.WHITE);
    
    Circle eye1 = new Circle(165, 137, 8);
    eye1.setFill(Color.BLACK);
    
    Circle eye2 = new Circle(235, 137, 8);
    eye2.setFill(Color.BLACK);
    
    Ellipse snout = new Ellipse(200, 150, 25, 18);
    snout.setFill(Color.WHITE);
    
    Ellipse nos1 = new Ellipse(190, 147, 2, 4);
    nos1.setFill(Color.web("#FFB6C1"));
    
    Ellipse nos2 = new Ellipse(210, 147, 2, 4);
    nos2.setFill(Color.web("#FFB6C1"));
    
    hornA = new Line(190, 100, 200, 60);
    hornA.setStroke(hornColor);
    hornA.setStrokeWidth(5.0);
    
    hornB = new Line(210, 100, 200, 60);
    hornB.setStroke(hornColor);
    hornB.setStrokeWidth(5.0);
    
    hornC = new Line(190, 100, 210, 100);
    hornC.setStroke(hornColor);
    hornC.setStrokeWidth(5.0);
    
    Line lash1 = new Line(160, 137, 150, 134);
    Line lash2 = new Line(162, 133, 152, 130);
    
    Line lash3 = new Line(240, 137, 250, 134);
    Line lash4 = new Line(238, 133, 248, 130);
    
    ear1 = new Ellipse(130, 115, 20, 9);
    ear1.setFill(bodyColor);
    
    ear2 = new Ellipse(270, 115, 20, 9);
    ear2.setFill(bodyColor);
    
    // grouping the shapes
    Group shapes = new Group(body, tummy, eye1, eye2, snout, nos1, nos2, hornA, hornB, hornC, lash1, lash2, lash3, lash4, ear1, ear2);
    
    // printing the group
    return shapes;
  }
  
   public void setName(String newName){
    name = newName;
    
  }
   
   public void setBodyColor(Color newBodyColor){
    bodyColor = newBodyColor;
    body.setFill(bodyColor);
    ear1.setFill(bodyColor);
    ear2.setFill(bodyColor);
  }
   
   public void setHornColor(Color newHornColor){
    hornColor = newHornColor;
    hornA.setStroke(hornColor);
    hornB.setStroke(hornColor);
    hornC.setStroke(hornColor);
  }
   
   public String getWorth(){
    Random random = new Random();
    
    worth = random.nextInt(500);
    
    return "This unicorn is worth " + worth + " gazillion dollars.";
  }
   
   public String toString(){
    return "This unicorn is " + name + ".";
   }

}