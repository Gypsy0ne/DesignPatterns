package model

internal sealed class Room(open val id: Int) {
    data class RegularRoom(override val id: Int) : Room(id)
    data class RoomWithTrap(override val id: Int, val damage: Int) : Room(id)
}