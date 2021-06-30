import model.Door
import model.Maze
import model.Room

// to get various implementations provide different prototypes
internal class MazePrototypeFactory(private val mazePrototype: Maze, private val roomPrototype: Room, private val doorPrototype: Door) : MazeFactory {

    override fun makeMaze(): Maze = mazePrototype.clone()
    override fun makeRoom(roomId: Int): Room = roomPrototype.clone(roomId)

    override fun makeDoor(roomFrom: Room, roomTo: Room): Door = doorPrototype.clone(roomFrom, roomTo)
}