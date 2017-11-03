package pe.cordova.service;

import org.junit.Assert;
import org.junit.Test;

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