package impl

internal object WindowSystemFactory {
    // some specific implementation
    fun makeWindowImpl(): WindowImp = PMWindowImp()
}