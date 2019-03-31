package vooo;

import java.util.Random;

import processing.core.PGraphics;

public class Triangle extends Figure{

	public Triangle(int length, int angle, int color) {
		super(length, angle, color);
		// TODO Auto-generated constructor stub
	}
	
	protected void drawTriangle(PGraphics pg) {
		int colorR = generator.nextInt(255);
		int colorG = generator.nextInt(255);
		int colorB = generator.nextInt(255);
		pg.fill(colorR, colorG, colorB);
		pg.triangle((colorR/255)*700, (colorB/255)*700, (colorR+colorG/255)*700, (colorB+colorG/255)*700, (colorG/255)*700, (colorB/255)*700);
	}

}
