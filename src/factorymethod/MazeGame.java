package factorymethod;

import model.base.Direction;
import model.base.Door;
import model.base.Maze;
import model.base.Room;
import model.base.Wall;

/**
 * @Date 2016��7��29��20:47:40
 * @fun Factory Method
 * @author shadow
 *
 */
public abstract class MazeGame {
	public Maze CreateMaze(){
		Maze aMaze = MakeMaze();
		Room r1 = MakeRoom(1);
		Room r2 = MakeRoom(2);
		Door theDoor = MakeDoor(r1, r2);
		
		aMaze.AddRoom(r1);
		aMaze.AddRoom(r2);
		
		r1.SetSide(Direction.North, MakeWall());
		r1.SetSide(Direction.East, theDoor);
		r1.SetSide(Direction.South, MakeWall());
		r1.SetSide(Direction.West, MakeWall());
		
		r1.SetSide(Direction.North, MakeWall());
		r1.SetSide(Direction.East, MakeWall());
		r1.SetSide(Direction.South, MakeWall());
		r1.SetSide(Direction.West, theDoor);
		return aMaze;
	}
	
	public abstract Maze MakeMaze();
	public abstract Room MakeRoom(int number);
	public abstract Wall MakeWall();
	public abstract Door MakeDoor(Room r1, Room r2);
	
}
