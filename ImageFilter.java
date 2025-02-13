import org.code.theater.*;
import org.code.media.*;

/*
* Represents an image that contains multiple filters
*/
public class ImageFilter extends ImagePlus {

/*
* Calls the superclass constructor to initialize the 2D array
*/
  public ImageFilter(String filename) {
    super(filename);
  }

  /**IMAGE FILTERS FROM LESSON 8 */

 /*
   * Inverts the colors in the image by setting the red,
   * green, and blue color values of each Pixel object to
   * the result of 255 minus their current values
   */
  public void makeNegative() {
//0. Get the array of pixels
  Pixel[][] pixels = getImagePixels();
  
  //1. Traverse the 2D array of Pixels
for (int row = 0; row < pixels.length; row++) {
for (int col = 0; col < pixels[0].length; col++) {
  //2. Select the current Pixel
Pixel currentPixel = pixels[row][col];
  
  //3. Change the color value to -255 for the 
  // current Pixel
  currentPixel.setRed(255 - currentPixel.getRed());
  currentPixel.setGreen(255 - currentPixel.getGreen());
  currentPixel.setBlue(255 - currentPixel.getBlue());
}
}
  }

   /*
   * Applies a colorize filter by converting each Pixel to grayscale and applying
   * a color to it based on its grayscale value
   */
  public void colorize() {
 Pixel[][] pixels = getImagePixels();
    
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        Pixel pixel = pixels[row][col];
        int average = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;

        if (average < 85) {
          pixel.setRed(255);
          pixel.setGreen(0);
          pixel.setBlue(0);
        } else if (average < 170) {
          pixel.setRed(0);
          pixel.setGreen(255);
          pixel.setBlue(0);
        } else {
          pixel.setRed(0);
          pixel.setGreen(0);
          pixel.setBlue(255);
        }
      }
    }
  }

  /*
   * Mirrors the image vertically
   */
  public void mirrorVertical() {
 Pixel[][] pixels = getImagePixels();
    int width = pixels[0].length;

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < width / 2; col++) {
        Pixel leftPixel = pixels[row][col];
        Pixel rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }
  
}
