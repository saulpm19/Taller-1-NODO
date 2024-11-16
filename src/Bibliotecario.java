public class Bibliotecario extends Persona implements Gestionable
{
    public Bibliotecario(String nombre, String apellido)
    {
        super(nombre, apellido);
    }


    @Override
    public void devolverLibro(Usuario usuario, Libro libro)
    {
        usuario.librosPermitido.remove(libro.getIsbn());
        System.out.println("el usuario ha devuelto el libro: "+libro.getTitulo());
    }

    @Override
    public void prestarLibro(Usuario usuario, Libro libro)
    {

        if (usuario.librosPermitido.size() >= 3) {
            System.out.println("El usuario ya alcanzó el máximo de libros permitidos.");
            return;
        }




        libro.prestar();
        usuario.librosPermitido.add(libro);


        String nombreUsuario = usuario.getNombre();
        String apellidoUsuario = usuario.getApellido();
        String tituloLibro = libro.getTitulo();

        System.out.println("El usuario " + nombreUsuario + " " + apellidoUsuario +
                " prestó el libro: " + tituloLibro);
    }

    @Override
    public void mostrarDatos()
    {
        System.out.println("Bibliotecario: " + getNombre() + " " + getApellido());

    }


}
