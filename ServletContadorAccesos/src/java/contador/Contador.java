package contador;

import javax.faces.bean.SessionScoped;


@SessionScoped

public class Contador {

    int cont;

    public Contador() {
        this.cont = 1;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    public int addCont() {
        return this.cont++;
    }
}
