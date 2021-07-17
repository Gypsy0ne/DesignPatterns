package model

internal sealed class Room(open val id: Int) {
    data class RegularRoom(override val id: Int) : Room(id) {
        override fun clone(id: Int): Room = copy(id = id)
    }

    data class RoomWithTrap(override val id: Int, val damage: Int) : Room(id) {
        override fun clone(id: Int): Room = copy(id = id)
    }

    abstract fun clone(id: Int): Room
}

// alternative to abstract clone method
internal fun Room.copy(id: Int) = when(this) {
    is Room.RegularRoom -> copy(id = id)
    is Room.RoomWithTrap -> copy(id = id)
}
