package model

internal sealed class Door(open val roomFrom: Room, open val roomTo: Room) {
    data class LockedDoor(override val roomFrom: Room, override val roomTo: Room, val password: String?) : Door(roomFrom, roomTo)
    data class RegularDoor(override val roomFrom: Room, override val roomTo: Room) : Door(roomFrom, roomTo)
}