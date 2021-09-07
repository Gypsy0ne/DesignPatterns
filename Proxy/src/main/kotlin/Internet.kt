internal interface Internet {
    fun connectTo(serverHost: String): ConnectionStatus
}