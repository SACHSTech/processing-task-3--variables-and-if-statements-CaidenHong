import processing.core.PApplet;

public class Sketch extends PApplet {
  public double dblPosition = random(-width, width);
  public void settings() {

    // Set size of application
    size(1920, 1050);
  }

  public void setup() {
    // Set background colour to sky blue
    background(135, 206, 235);
    
  }
  public void house(double x) {

    // Stroke settings for house
    strokeWeight(0);
    fill(105, 27, 22);
    stroke(255);

    // house
    rect((float)((width/4) - x), (float)(height/2.25), (float)(width/2), height/2);
    
    // Chimney
    rect((float)((width/1.67) - x), height/4, (float)(width/10), (float)(height/5.71));

    // colour settings for roof
    fill(79, 30, 2);

    // Roof
    triangle((float)((width/8) - x), (float)(height/1.92), (float)((width/1.14) - x), (float)(height/1.92), (float)((width/2) - x), height/4);

    // Stroke setting for window
    fill(145, 234, 330);

    // window
    ellipse((float)((width/2) - x), (float)(height/2.35),  (float)(width/13.33), (float)(height/13.33));
  }

  public void draw() {

    if (dblPosition > 0){ 
      // background
      background(135, 206, 235);
      
      // stroke setting for sun
      fill(255, 242, 0);
      stroke(255, 242, 0);
    
      //sun
      ellipse(width/1, 0, width/4, height/4);
    }

    else{
      // background
      background(38, 46, 82);

      // stroke settings for moon
      fill(174, 176, 184);
      stroke(174, 176, 184);
    
      // moon
      ellipse(width/1, 0, width/4, height/4);  
    }

    // Stroke settings for foreground
    stroke(0,255,0);
    strokeWeight(4);

    // Fill rectangle in brown
    fill(139,69,19);

    // Foreground
    rect((width/-20), (float)(height/1.07), (float)(width/0.91), height/1);

    house(dblPosition);

    // time
    fill(0, 0, 0);
    textSize(width/30);
    text(month() + "/" + day() + "/" + year() + " " + hour() + ":" + minute() + ":" + second(), width/40, (float) (height/1.01));
    
  }
}