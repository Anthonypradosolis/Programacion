import java.util.ArrayList;
public class RedSocial {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Publicacion> publicaciones;

    public RedSocial() {
        this.usuarios = new ArrayList<>();
        this.publicaciones = new ArrayList<>();
    }

    public boolean registrarse(String nombre,String contraseña){
        for(Usuario usuario : usuarios){
            if(usuario.getNombre().equals(nombre)){
                return false;
            }
        }
        usuarios.add(new Usuario(nombre,contraseña));
        return true;
    }
    public boolean iniciarSesion(String nombre,String contraseña){
        for(Usuario usuario : usuarios){
            if(usuario.getNombre().equals(nombre)&& usuario.getContraseña().equals(contraseña)){
                return true;
            }
        }return false;
    }
    public void publicarMensaje(String nombre,String contraseña){
        publicaciones.add( new Publicacion(nombre,contraseña));
    }
    public ArrayList<Publicacion> verPublicacion(){
        return publicaciones;
    }
    public Usuario getUsuario(String nombre){
        for(Usuario usuario : usuarios){
            if(usuario.getNombre().equals(nombre)){
                return usuario;
            }
        }return null;
    }

}
