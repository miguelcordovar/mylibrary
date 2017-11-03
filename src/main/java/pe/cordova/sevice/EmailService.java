package pe.cordova.sevice;

public class EmailService {

    public String GenerateEmail(String name, String domain) {

        return name.concat("@").concat(domain);
    }

}
