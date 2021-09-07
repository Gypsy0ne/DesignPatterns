package impl

import model.Point

internal interface WindowImp {
    fun impTop() {}
    fun impBottom() {}
    fun impSetExtent(at: Point) {}
    fun impSetOrigin(at: Point) {}

    // various functions to display windows
    fun deviceRect(upperLeft: Point, bottomRight: Point) {}
    fun deviceText(at: Point, text: String) {}
    fun deviceBitmap(bitmapName: String, upperLeft: Point, bottomRight: Point) {}
}