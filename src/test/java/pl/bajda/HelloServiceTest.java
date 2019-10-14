package pl.bajda;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloServiceTest {
    private HelloService TEST = new HelloService();

    @Test
    public void test_prepareGreeting_null_returnsFallback() throws Exception {
        //given + when
        String result = TEST.prepareGreeting(null);

        //then
        assertEquals("Hello " + HelloService.FALLBACK_NAME + "!", result);
    }

    @Test
    public void test_prepareGreeting_name_returnsGreetingWhitName() throws Exception {
        //given
         String name = "test";

        // when
        String result = TEST.prepareGreeting(name);

        //then
        assertEquals("Hello " + name + "!", result);
    }

}