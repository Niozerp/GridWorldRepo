/**
 * @author Jon Ausherman
 * @date Mar 19, 2014
 * @version 1.0
 */
package boxbug;

import info.gridworld.actor.ActorWorld;

public class BoxBugRunner {

	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		world.add(new BoxBug(4));
		world.show();
	}

}
