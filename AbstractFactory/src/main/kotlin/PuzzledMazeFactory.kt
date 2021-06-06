import model.Door
import model.Maze
import model.Room
import kotlin.random.Random

internal class PuzzledMazeFactory : MazeFactory {

    override fun makeMaze(): Maze = Maze.PuzzledMaze()

    override fun makeRoom(roomId: Int): Room = Room.RoomWithTrap(roomId, getRandomDamage())

    override fun makeDoor(roomFrom: Room, roomTo: Room): Door = Door.LockedDoor(roomFrom = roomFrom, roomTo = roomTo, password = getRandomPassword())

    private fun getRandomDamage() = Random(2).nextInt(MIN_DAMAGE, MAX_DAMAGE)

    private fun getRandomPassword() = (1..PASSWORD_LENGTH)
            .map { PASSWORD_SOURCE.random() }
            .joinToString("")

    companion object {
        private const val PASSWORD_SOURCE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        private const val MAX_DAMAGE = 10
        private const val MIN_DAMAGE = 1
        private const val PASSWORD_LENGTH = 5
    }
}