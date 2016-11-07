package pol.una.contactos.beans;


import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import pol.una.contactos.util.Contacto;

@Named(value = "contactoBean")
@RequestScoped
public class BeanContacto{
    
    private Contacto instance;

    public BeanContacto() {
        this.instance = new Contacto();
    }
    
    public Contacto getInstance() {
        return instance;
    }

    public void setInstance(Contacto instance) {
        this.instance = instance;
    }
    
}
