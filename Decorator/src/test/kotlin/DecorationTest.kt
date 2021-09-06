import io.mockk.spyk
import io.mockk.verifyOrder
import org.junit.Test

internal class DecorationTest {

    @Test
    fun `should decorate text view in the right order`() {
        // given
        val textView = spyk(TextView())
        val scrollDecorator = spyk(ScrollDecorator(textView))
        val borderDecorator = spyk(BorderDecorator(scrollDecorator, 3))

        // when
        borderDecorator.draw()

        // then
        verifyOrder {
            borderDecorator.draw()
            scrollDecorator.draw()
            textView.draw()
        }
    }
}