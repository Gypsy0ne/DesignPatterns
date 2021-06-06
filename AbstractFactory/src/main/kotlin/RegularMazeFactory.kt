import model.Door
import model.Maze
import model.Room

internal class RegularMazeFactory : MazeFactory {
    override fun makeMaze(): Maze = Maze.RegularMaze()

    override fun makeRoom(roomId: Int): Room = Room.RegularRoom(roomId)

    override fun makeDoor(roomFrom: Room, roomTo: Room): Door = Door.RegularDoor(roomFrom = roomFrom, roomTo = roomTo)

}