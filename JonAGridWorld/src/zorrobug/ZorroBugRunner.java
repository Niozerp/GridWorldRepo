/**
 * @author Jon Ausherman
 * @date Mar 19, 2014
 * @version 1.5
 */
package zorrobug;

import info.gridworld.actor.ActorWorld;

public class ZorroBugRunner {

	/**
	 * @discription adds a ZorroBug object to the grid
	 * I want to default set the grid to unbounded. Working on that
	 * NO SUCCESS SO FAR
	 */
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
        world.add(new ZorroBug(6));
        world.show();
	}

}
