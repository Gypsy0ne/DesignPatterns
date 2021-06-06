import model.Door
import model.Room
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PuzzledMazeFactoryTest {

    private val factory = PuzzledMazeFactory()

    @Test
    fun `should factory create locked door`() {
        // given
        val roomFrom = factory.makeRoom(2)
        val roomTo = factory.makeRoom(1)
        val door = factory.makeDoor(roomFrom = roomFrom, roomTo = roomTo)

        // then
        assertThat(door).isInstanceOf(Door.LockedDoor::class.java)
    }

    @Test
    fun `should factory create room with traps`() {
        // given
        val room = factory.makeRoom(2)

        // then
        assertThat(room).isInstanceOf(Room.RoomWithTrap::class.java)
    }
}