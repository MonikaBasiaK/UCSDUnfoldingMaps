package myexcercise;

import processing.core.PApplet;
import processing.core.PImage;

public class Module1 extends PApplet{
	
	private String URL = "https://www.catster.com/wp-content/uploads/2017/08/A-fluffy-cat-looking-funny-surprised-or-concerned.jpg";
	private PImage img;
	
	public void setup(){
		size(400,400);
		//background(255);
		stroke(0);
		img = loadImage(URL, "jpg");

	}
	
	public void draw(){
		img.resize(0, height);
		image(img, 0, 0);
		
		int[] color = sunColorSec(second());
		fill(color[0], color[1], color[2]);
		ellipse(width/4, height/5, width/5, height/5);
	}
	
	public int[] sunColorSec(float second) {
		
		int[] rgb = new int[3];
		float diffFrom30 = Math.abs(30-second());
		float ratio = diffFrom30/30;
		rgb[0] = (int) ratio * 255;
		rgb[1] = (int) ratio * 255;
		rgb[2] = 0;
		return rgb;
	}

}
