package model

internal class Maze {
    private val doors = mutableListOf<Door>()
    private val rooms = mutableListOf<Room>()

    fun addDoor(door: Door) = doors.add(door)
    fun addDoor(door: List<Door>) = doors.addAll(door)

    fun addRoom(room: Room) = rooms.add(room)
    fun addRoom(room: List<Room>) = rooms.addAll(room)

    // shallow copy
    fun clone() = Maze().apply {
        addDoor(doors)
        addRoom(rooms)
    }
}