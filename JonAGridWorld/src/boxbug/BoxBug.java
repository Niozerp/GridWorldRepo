/**
 * @author Jon Ausherman
 * @date Mar 19, 2014
 * @version 1.0
 */
package boxbug;

import info.gridworld.actor.Bug;

public class BoxBug extends Bug {
	private int sideLength;
	private int steps;
	
	public BoxBug(int length){
		sideLength = length;
		steps=0;
	}

	@Override
	public void act() {
		if((steps<sideLength)&&(canMove())){
			move();
			steps++;
		}else{
			turn();
			turn();
			steps=0;			
		}
	}
	
	
}
