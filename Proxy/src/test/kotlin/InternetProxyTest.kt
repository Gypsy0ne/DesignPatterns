import io.mockk.spyk
import io.mockk.verify
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

internal class InternetProxyTest {

    private val internet = spyk(RealInternet())
    private val proxy = InternetProxy(internet)

    @Test
    fun `should proxy return error status for banned serverHost`() {
        // given
        val serverHost = "facebook.com"

        // when & then
        assertThat(proxy.connectTo(serverHost)).isEqualTo(ConnectionStatus.Error)
    }

    @Test
    fun `should proxy return success status for serverHost`() {
        // given
        val serverHost = "abc-shop.com"

        // when & then
        assertThat(proxy.connectTo(serverHost)).isEqualTo(ConnectionStatus.Success)
    }

    @Test
    fun `should proxy delegate connection request to proxied object`() {
        // given
        val serverHost = "abc-shop.com"

        // when
        proxy.connectTo(serverHost)

        // then
        verify(exactly = 1) { internet.connectTo(serverHost) }
    }
}