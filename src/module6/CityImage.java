package module6;

import processing.core.PApplet;
import processing.core.PGraphics;
import processing.core.PImage;

public class CityImage extends PApplet{
	public static int TRI_SIZE = 5; 
	PImage city;

public void setup() {
	city = loadImage("city.jpg");
}

public void drawM(PGraphics pg, float x, float y) {
	//pg.image(city, y-TRI_SIZE, x-TRI_SIZE);
}
}