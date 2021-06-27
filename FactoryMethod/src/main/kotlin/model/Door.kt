package model

internal sealed class Door(open val from: Room, open val to: Room) {
    data class RegularDoor(override val from: Room, override val to: Room): Door(from, to)
    data class BombedDoor(override val from: Room, override val to: Room): Door(from, to)
}