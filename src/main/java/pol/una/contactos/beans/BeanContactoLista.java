package pol.una.contactos.beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import pol.una.contactos.rest.RestService;
import pol.una.contactos.util.ContactoLista;

@Named(value = "contactoListBean")
@RequestScoped
public class BeanContactoLista {
    
    private ContactoLista instance;
    
    public BeanContactoLista(){
         this.instance = RestService.getContactos();
    }
    public ContactoLista getInstance(){
       System.out.println(instance.getLista().size());
       return instance;
    }

    public void setInstance(ContactoLista instance) {
        this.instance = instance;
    }
    
    
}
