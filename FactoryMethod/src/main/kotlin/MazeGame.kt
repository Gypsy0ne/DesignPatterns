import model.Door
import model.Maze
import model.Room

//default implementation inside
internal interface MazeGame {
    fun createMaze(): Maze {
        return makeMaze().apply {
            val room1 = makeRoom(1)
            val room2 = makeRoom(2)
            val door = makeDoor(room1, room2)

            addRoom(room1)
            addRoom(room2)
            addDoor(door)
        }

    }

    // factory methods
    fun makeMaze(): Maze = Maze.RegularMaze()
    fun makeRoom(index: Int): Room = Room.RegularRoom(index)
    fun makeDoor(from: Room, to: Room): Door= Door.RegularDoor(from, to)
}