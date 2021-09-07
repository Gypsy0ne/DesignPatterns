internal class InternetProxy(private val proxiedInternet: Internet) : Internet {
    private val bannedSites = listOf<String>("facebook.com", "instagram.com", "pornhub.com")

    override fun connectTo(serverHost: String): ConnectionStatus = if (bannedSites.contains(serverHost)) {
        ConnectionStatus.Error
    } else {
        proxiedInternet.connectTo(serverHost)
    }
}