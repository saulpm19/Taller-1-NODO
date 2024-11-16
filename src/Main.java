//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        List<Libro> listaDeLibros = new ArrayList<>();

        Libro libro1 = new Libro("Harry Potter y la piedra filosofal","J.K Rolling",1,true);

        Libro libro2 = new Libro("La Torre Oscura","Stephen King",1,true);

        Usuario usuario = new Usuario("Saul", "Perez");

        Bibliotecario bibliotecario = new Bibliotecario("Catherine", "Usme");


        usuario.mostrarDatos();
        bibliotecario.mostrarDatos();


        bibliotecario.prestarLibro(usuario, libro1);
        bibliotecario.prestarLibro(usuario,libro2);


        listaDeLibros.add(libro1);
        listaDeLibros.add(libro2);

        System.out.println("El usuario ha prestado una cantidad de " + listaDeLibros.size() + " libros");

        bibliotecario.devolverLibro(usuario, libro1);

        listaDeLibros.remove(libro1);

        System.out.println("El usuario ha prestado una cantidad de " + listaDeLibros.size() + " libros");






    }
}