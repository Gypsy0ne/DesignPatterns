package adapter

import adapter.model.BoundingBox

internal interface Shape {
    val boundingBox: BoundingBox
    fun createManipulator(): Manipulator
}