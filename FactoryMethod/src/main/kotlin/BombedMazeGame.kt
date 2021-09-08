import model.Door
import model.Maze
import model.Room

internal class BombedMazeGame : MazeGame {
    override fun makeDoor(from: Room, to: Room): Door {
        return Door.BombedDoor(from, to)
    }

    override fun makeRoom(index: Int): Room {
        return Room.BombedRoom(index, true)
    }

    override fun makeMaze(): Maze {
        return Maze.BombedMaze()
    }
}