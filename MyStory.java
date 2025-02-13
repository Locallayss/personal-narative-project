import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {

  // Instance Variables
  private String[][] variable1;
  private ImageFilter[][] variable2;
  private ImageFilter[][] variable3;
   
  
  
  // Constructor
  public MyStory(String[][] variable1, ImageFilter[][] variable2) {
    this.variable1 = variable1;
    this.variable2 = variable2;
    this.variable3 = variable3;
     
    
  }

  // Calls all the parts of your animation, in order
  public void drawScene() {
    drawIntroScene();
    drawAlbumScene();
    drawSecondScene();
    drawLasVegasScene();
    drawJaliscoScene();
  
    
  }

  public void drawIntroScene() {
    // 1. clear the scene / draw background
clear("pink");
    // 2. Set any style (text size, font, font style, fill color)
setTextHeight(30);
    setTextColor("white");
    setTextStyle(Font.MONO, FontStyle.BOLD);
    // 3. Draw text and images, play sounds
drawText("My Interests", 50, 200);
    // 4. Pause before transitioning
    pause(1.0);
  }
//draws the Albums scene
  public void drawAlbumScene() {
    clear("white");
 drawImage(variable2[0][0], 0, 0, 200);
    pause(0.5);
     variable2[0][0].makeNegative();
    drawImage(variable2[0][1], 200, 0, 200);
    pause(0.5);
     variable2[0][1].makeNegative();
    drawImage(variable2[1][0], 0, 200, 200);
    pause(0.5);
     variable2[1][0].makeNegative();
    drawImage(variable2[1][1], 200, 200, 200);
    pause(1.0);
     variable2[1][1].makeNegative();
  }
//draws the second scene
  public void drawSecondScene() {
    clear("white");

    drawText(variable1[0][0], 0, 0, 200);
    pause(0.5);
    drawText(variable1[0][1], 200, 0, 200);
    pause(0.5);
    drawText(variable1[1][0], 0, 200, 200);
    pause(0.5);
    drawText(variable1[1][1], 200, 200, 200);

    pause(1.0);
  }


  //draws the Las vegas scene and colorizes the image
  public void drawLasVegasScene() {
     clear("white");
    setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.MONO, FontStyle.BOLD);
    drawImage("attractions-in-nevada.jpg", 50, 100, 300);
  pause(0.5);
ImageFilter one = new ImageFilter("attractions-in-nevada.jpg");
    one.colorize();
    drawImage(one, 50, 150, 300);
    pause(1.0);
  }
//draws the Jalisco scene and uses the mirrorVertical image filter
    public void drawJaliscoScene() {
     clear("white");
    setTextHeight(30);
  setTextColor("black");
  setTextStyle(Font.MONO, FontStyle.BOLD);
    drawImage("dcyvuevzd6lwt8maaf4k.jpg", 50, 100, 300);
  pause(0.5);
ImageFilter one = new ImageFilter("dcyvuevzd6lwt8maaf4k.jpg");
    one.mirrorVertical();
    drawImage(one, 50, 150, 300);
    pause(1.0);
  }
  
  // other methods
  }
