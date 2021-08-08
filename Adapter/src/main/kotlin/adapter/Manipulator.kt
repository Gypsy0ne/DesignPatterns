package adapter

import adapter.model.Point

internal interface Manipulator {
    fun moveShape(destination: Point)
}