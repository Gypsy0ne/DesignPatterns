package model

internal sealed class Door(open val roomFrom: Room, open val roomTo: Room) {

    data class LockedDoor(override val roomFrom: Room, override val roomTo: Room, val password: String?) : Door(roomFrom, roomTo) {
        override fun clone(roomFrom: Room, roomTo: Room): Door = copy(roomFrom = roomFrom, roomTo = roomTo)
    }

    data class RegularDoor(override val roomFrom: Room, override val roomTo: Room) : Door(roomFrom, roomTo) {
        override fun clone(roomFrom: Room, roomTo: Room): Door = copy(roomFrom = roomFrom, roomTo = roomTo)
    }

    abstract fun clone(roomFrom: Room, roomTo: Room): Door
}

// alternative to clone method
internal fun Door.copy(roomFrom: Room, roomTo: Room) = when(this) {
    is Door.LockedDoor  -> copy(roomFrom, roomTo)
    is Door.RegularDoor -> copy(roomFrom, roomTo)
}