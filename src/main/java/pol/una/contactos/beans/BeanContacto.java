package pol.una.contactos.beans;


import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import pol.una.contactos.rest.RestService;
import pol.una.contactos.util.Contacto;

@Named(value = "contactoBean")
@RequestScoped
public class BeanContacto{
    
    private Contacto instance;
    
    private Long idContacto;
    
    public void init(Long id){
        idContacto = id;
        System.out.println("Esto es una prueba de cargar");
        Contacto instance = RestService.mostrarDetalles(idContacto);
    }

    public BeanContacto() {
        this.instance = new Contacto();
    }
    
    public Contacto getInstance() {
        return instance;
    }

    public void setInstance(Contacto instance) {
        this.instance = instance;
    }
    
    public Long getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Long idContacto) {
        this.idContacto = idContacto;
    }
    
}
