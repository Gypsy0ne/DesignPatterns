class PuzzledMazeFactoryTest {

    private val factory = PuzzledMazeFactory()

    fun `should factory create only locked doors`() {

    }

    fun `should factory create only rooms with traps`() {
        // given
        val room = factory.makeRoom(2)

        // then
        assertThat()
    }
}