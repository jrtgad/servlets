package classes;

import javax.faces.bean.SessionScoped;

@SessionScoped
public class SecretNumber {

    public int secret;

    public SecretNumber(int secret) {
        this.secret = secret;
    }

    public int getSecret() {
        return secret;
    }

    public void setSecret(int secret) {
        this.secret = secret;
    }
}
