internal class RealInternet : Internet {
    override fun connectTo(serverHost: String): ConnectionStatus = ConnectionStatus.Success
}
