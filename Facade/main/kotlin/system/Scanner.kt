package system

import model.InputStream
import model.Token

internal abstract class Scanner(private val inputStream: InputStream) {
    abstract fun scan(): Token
}