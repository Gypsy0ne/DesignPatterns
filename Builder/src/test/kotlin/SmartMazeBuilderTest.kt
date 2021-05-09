import model.Door
import model.Room
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

internal class SmartMazeBuilderTest {

    @Test
    fun `should build maze`() {
        // given
        val rooms = listOf(Room(1), Room(2))
        val doors = listOf(Door(roomFrom = 1, roomTo = 2))

        // when
        val builtMaze = SmartMazeBuilder().doors(doors).rooms(rooms).build()

        // then
        assertThat(builtMaze.doors).isEqualTo(doors)
        assertThat(builtMaze.rooms).isEqualTo(rooms)
    }

    @Test
    fun `should build maze without same indexed rooms`() {
        // given
        val invalidDoor = Door(roomFrom = 1, roomTo = 1)
        val doors = listOf(invalidDoor, Door(roomFrom = 1, roomTo = 2))

        // when
        val builtMaze = SmartMazeBuilder().doors(doors).build()

        // then
        assertThat(builtMaze.doors).hasSize(1)
        assertThat(builtMaze.doors).doesNotContainSequence(invalidDoor)
    }

    @Test
    fun `should build maze without doors leading to the same room`() {
        // given
        val rooms = listOf(Room(1), Room(1))

        // when
        val builtMaze = SmartMazeBuilder().rooms(rooms).build()

        // then
        assertThat(builtMaze.rooms).hasSize(1)
        assertThat(builtMaze.rooms.first().index).isEqualTo(1)
    }

    @Test
    fun `should build empty maze when no data is given`() {
        // when
        val emptyMaze = SmartMazeBuilder().build()

        // then
        assertThat(emptyMaze.doors).isEmpty()
        assertThat(emptyMaze.rooms).isEmpty()
    }
}