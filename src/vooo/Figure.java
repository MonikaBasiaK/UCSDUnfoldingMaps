package vooo;

import java.util.Random;

public class Figure {

	int angle;
	int length;	
	int color;
	Random generator = new Random();
	
	public Figure(int length, int angle, int color) {
		this.length = length;
		this.angle = angle;
		this.color = color;
	}
	protected void drawFigure() {
		boolean value = generator.nextBoolean();
		//if()
		
		
	}
}
