import model.Door
import model.Maze
import model.Room

internal class SmartMazeBuilder : MazeBuilder {
    override var rooms: List<Room> = emptyList()
        private set
    override var doors: List<Door> = emptyList()
        private set

    override fun build() = Maze(rooms, doors)

    fun rooms(mazeRooms: List<Room>) = apply { rooms = mazeRooms.distinctBy { it.index } }
    fun doors(mazeDoors: List<Door>) = apply { doors = mazeDoors.filter { it.doesNotLeadToSameRoom() } }

    private fun Door.doesNotLeadToSameRoom() = roomTo != roomFrom
}
