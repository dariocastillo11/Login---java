package Persistencia;

import Logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
   
    UsuarioJpaController  usuJpa= new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
        //SELEC * FROM USUARIO
    }
    
    
}
