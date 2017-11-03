package pe.cordova.service;

public class EmailService {

    public String GenerateEmail(String name, String domain) {

        return name.concat("@").concat(domain);
    }

}
