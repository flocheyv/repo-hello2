package hello2



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HelloController)
class HelloControllerTests {

    void testSomething() {
       controller.index()
		assertEquals 'hello', controller.response.contentAsString
    }
}
