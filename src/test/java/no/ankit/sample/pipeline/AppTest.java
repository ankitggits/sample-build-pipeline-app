package no.ankit.sample.pipeline;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class AppTest {

    App app;

    @Before
    public void init(){
        app = new App();
    }

    @Test
    public void testHome(){
        Assert.assertTrue(app.home().equals("Hello World!"));
    }
}
