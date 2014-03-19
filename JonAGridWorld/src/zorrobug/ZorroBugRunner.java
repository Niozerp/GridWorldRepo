/**
 * @author Jon Ausherman
 * @date Mar 19, 2014
 * @version 1.5
 */
package zorrobug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

public class ZorroBugRunner {

	/**
	 * @discription adds a ZorroBug object to the grid
	 * I want to default set the grid to unbounded. Working on that
	 * NO SUCCESS SO FAR
	 */
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
        Location bh = new Location(4,5);
        Grid woObj = new UnboundedGrid();
        world.add(new ZorroBug(6));
        woObj.put(bh, new ZorroBug(6));
        
        world.show();
	}

}
