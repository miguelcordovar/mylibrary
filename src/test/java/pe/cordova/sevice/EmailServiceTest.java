package pe.cordova.sevice;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class EmailServiceTest {

    @Test
    public void TestEmail() {

        String name = "miguel";
        String domain = "tcs.com";

        String email = "miguel@tcs.com";

        EmailService service = new EmailService();

        Assert.assertEquals(email, service.GenerateEmail(name,domain));


    }


}