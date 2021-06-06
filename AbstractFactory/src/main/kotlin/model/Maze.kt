package model

internal sealed class Maze {
    private val doors = mutableListOf<Door>()
    private val rooms = mutableListOf<Room>()

    fun addDoor(door: Door) = doors.add(door)
    fun addRoom(room: Room) = rooms.add(room)

    class PuzzledMaze : Maze()
    class RegularMaze : Maze()
}