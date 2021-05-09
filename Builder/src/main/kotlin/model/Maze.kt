package model

import MazeBuilder

internal data class Maze(val rooms: List<Room>, val doors: List<Door>) {
    private constructor(builder: MazeBuilder) : this(builder.rooms, builder.doors)
}