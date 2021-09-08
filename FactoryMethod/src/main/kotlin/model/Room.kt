package model

internal sealed class Room(open val index: Int) {
    class RegularRoom(index: Int): Room(index)
    data class BombedRoom(override val index: Int, val hasBomb: Boolean): Room(index)
}