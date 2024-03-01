package de.syngenio.demo;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;


public class TestMyTestClass {

    @Test
    public void testSayHello() {
        OutputStream os = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(os, true);

        Hello hi = new Hello();
        hi.sayHello(stream);

        assertThat(os.toString(), is(equalTo(String.format("%s%s", Hello.HELLO, System.lineSeparator()))));
    }

    @Test
    public void testSayHelloAFewTimes() {
        OutputStream os = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(os, true);

        Hello hi = new Hello();
        hi.setTimes(3);
        hi.sayHello(stream);

        // Does it say "Hello!" three times?
        String goal = String.format("%1$s%2$s%1$s%2$s%1$s%2$s", Hello.HELLO, System.lineSeparator());
        assertThat(os.toString(), is(equalTo(goal)));
    }
}
