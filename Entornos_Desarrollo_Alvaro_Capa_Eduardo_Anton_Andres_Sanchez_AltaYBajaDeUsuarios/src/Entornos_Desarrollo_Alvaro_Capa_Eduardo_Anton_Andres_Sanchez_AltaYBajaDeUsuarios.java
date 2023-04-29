import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Alvaro_Andres_Edu
 */
public class Entornos_Desarrollo_Alvaro_Capa_Eduardo_Anton_Andres_Sanchez_AltaYBajaDeUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<String> UsuariosHashtSet = new HashSet<>();
        int menu = 0;

        Scanner teclado = new Scanner(System.in);
        String Aux = "";
        System.out.println("Elige la opcion del menu");
        do {
            System.out.println("-----------------Menu-----------------\n"
                    + "1- Alta de Usuario\n"
                    + "2- Meter Contraseña de Usuario\n"
                    + "3- Listado completo de todos los Usuarios\n"
                    + "4- Generador de usuarios\n"
                    + "5- Salir\n"
                    + "---------------------------------------");
            try {
                Aux = teclado.nextLine();
                menu = Integer.parseInt(Aux);
            } catch (NumberFormatException e) {
                System.out.println("No es un number NaN");
            }
            if (menu == 1) {
                System.out.println("--------------1--------------");
                String usuario = Usuarios.PideNombre();

                if (UsuariosHashtSet.contains(usuario)) {
                    System.out.println("Este nombre ya esta en la lista");
                } else {
                    UsuariosHashtSet.add(usuario);
                    System.out.println(usuario + " Se añadió Correctamente.");
                }
            }

            if (menu == 2) {
                System.out.println("--------------2--------------");

                int contador = 0;
                for (String nombres : UsuariosHashtSet) {
                    contador++;
                    System.out.println(contador + " - " + nombres);
                }

                String nombre = "";
                int num = 0;
                do {
                    System.out.println("Elige el usuario");

                    num = Integer.parseInt(teclado.nextLine());

                } while (num > UsuariosHashtSet.size() || num <= 0);

                Usuarios.PideContra();

            }

            if (menu == 3) {
                System.out.println("--------------3--------------");
                int contador = 0;
                for (String nombres : UsuariosHashtSet) {
                    contador++;
                    System.out.println(contador + " - " + nombres);
                }
            }

            if (menu == 4) {
                System.out.println("--------------4--------------");
                String NuevoUsuario = Usuarios.GeneradorUsuarios();
                UsuariosHashtSet.add(NuevoUsuario);

            }

            if (menu <= 0 || menu > 5) {
                System.out.println("Numero introducido incorrecto.");
            }
        } while (menu != 5);

   }

}
