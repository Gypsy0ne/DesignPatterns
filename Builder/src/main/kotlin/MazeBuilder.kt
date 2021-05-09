import model.Door
import model.Maze
import model.Room

interface MazeBuilder {
    val doors: List<Door>
    val rooms: List<Room>

    fun build(): Maze
 }