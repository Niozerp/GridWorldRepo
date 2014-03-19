/**
 * @author Jon Ausherman
 * @date Mar 19, 2014
 * @version 2.5
 * @description ZorroBug is a Subclass of Bug and takes an int with its constructor
 * This sets the side lengths of the z shape it is going to make. It also overrides the act() method
 * to control the shape.
 * 
 */
package zorrobug;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class ZorroBug extends Bug {
	
	private int sideLength;
	private int steps;
	Location locObj = getLocation();
	
	public ZorroBug(int length){
		sideLength = length;
		steps=0;
		setDirection(locObj.EAST);
	}

	@Override
	public void act() {
		
		if((steps<sideLength)&&(canMove())){
			move();
			steps++;
		}else if((steps==sideLength)&&(canMove())){
			setDirection(locObj.SOUTHWEST);
			move();
			steps++;
		}else if((steps==(sideLength*2)&&(canMove()))){
			setDirection(locObj.EAST);
			move();
			steps++;
		}else if((steps==((sideLength*3)+1)&&(canMove()))){
			removeSelfFromGrid();
		}else{
			move();
			steps++;
		}
		
	}
	
	

}
