import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {
String[][] musicGenre = {
  {"K-pop", "Pop"},
  {"RnB","HipHop" }
};
 ImageFilter[][] albumImage = {
  {new ImageFilter("IMG_0026.jpeg"),new ImageFilter ("IMG_0027.jpeg")},
  {new ImageFilter("IMG_0028.jpeg"),new ImageFilter ("IMG_0030.jpeg")}
 };

     ImageFilter[][] gamesImage = {
  {new ImageFilter("IMG_0031.jpeg"),new ImageFilter ("IMG_0032.jpeg")},
  {new ImageFilter("IMG_0033.jpeg"),new ImageFilter ("IMG_0034.jpeg")}
 };

  
 
MyStory scene = new MyStory(musicGenre,albumImage);

    


    scene.drawScene();
  scene.drawScene();
    

    
    Theater.playScenes(scene);
 Theater.playScenes(scene);
    
  }
}


    