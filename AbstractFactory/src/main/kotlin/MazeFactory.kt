import model.Door
import model.Maze
import model.Room

internal interface MazeFactory {
    fun makeMaze(): Maze
    fun makeRoom(roomId: Int) : Room
    fun makeDoor(roomFrom: Room, roomTo: Room): Door
}