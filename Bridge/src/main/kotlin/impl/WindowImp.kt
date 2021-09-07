package impl

import model.Point

internal interface WindowImp {
    // various functions to display windows
    fun deviceRect(upperLeft: Point, bottomRight: Point) {}
    fun deviceText(at: Point, text: String) {}
    fun deviceBitmap(bitmapName: String, upperLeft: Point, bottomRight: Point) {}
}