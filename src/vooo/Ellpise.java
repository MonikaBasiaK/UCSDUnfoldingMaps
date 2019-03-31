package vooo;

import processing.core.PGraphics;

public class Ellpise extends Figure{

	public Ellpise(int length, int angle, int color) {
		super(length, angle, color);
		// TODO Auto-generated constructor stub
	}
	
	protected void drawEllipse(PGraphics pg) {
		int colorR = generator.nextInt(255);
		int colorG = generator.nextInt(255);
		int colorB = generator.nextInt(255);
		pg.fill(colorR, colorG, colorB);
		pg.ellipse((int)(colorR/255)*700, (int)(colorB/255)*700, (int)(colorG/255)*700, (int)(colorB/255)*700);
	}

}
