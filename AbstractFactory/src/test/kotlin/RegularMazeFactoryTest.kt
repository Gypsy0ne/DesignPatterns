import model.Door
import model.Room
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RegularMazeFactoryTest {

    private val factory = RegularMazeFactory()

    @Test
    fun `should factory create regular door`() {
        // given
        val roomFrom = factory.makeRoom(2)
        val roomTo = factory.makeRoom(1)
        val door = factory.makeDoor(roomFrom = roomFrom, roomTo = roomTo)

        // then
        assertThat(door).isInstanceOf(Door.RegularDoor::class.java)
    }

    @Test
    fun `should factory create regular room`() {
        // given
        val room = factory.makeRoom(2)

        // thenk
        assertThat(room).isInstanceOf(Room.RegularRoom::class.java)
    }
}