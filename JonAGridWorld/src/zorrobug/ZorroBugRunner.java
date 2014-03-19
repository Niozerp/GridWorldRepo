/**
 * @author Jon Ausherman
 * @date Mar 19, 2014
 * @version 1.0
 */
package zorrobug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.UnboundedGrid;

public class ZorroBugRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		world.add(new ZorroBug(6));
		world.setGrid(new UnboundedGrid());
		world.show();

	}

}
