package pe.cordova.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmailServiceTest {

    private EmailService service;

    @Before
    public void setup() {

        service = new EmailService();

    }

    @Test
    public void TestEmailGenerator() {

        System.out.println("TestCase - TestEmailGenerator");

        String name = "miguel";
        String domain = "tcs.com";

        String email = "miguel@tcs.com";

        Assert.assertEquals(email, service.GenerateEmail(name,domain));

    }


}