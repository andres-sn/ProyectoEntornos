/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author user
 */
public class Usuarios {

    public static String GeneradorUsuarios() {

        
        System.out.println("Introduce un nombre a generar.");
        String nombre = "";
        Scanner teclado = new Scanner(System.in);
        nombre = teclado.nextLine();
        int numeroAleatorio = (int) (Math.random() * 2000 + 1000);
        String NuevoUsuario = nombre + numeroAleatorio;
        System.out.println("Se generó el nombre " + NuevoUsuario + " y se añadió a la lista");
        return NuevoUsuario;
    }

    public static String PideNombre() {
        Scanner teclado = new Scanner(System.in);
        
        String nombre = "";
        System.out.println("Introducce el Nombre que deseas añadir (NombreusuarioXXXX)");
        nombre = teclado.nextLine();
        Pattern p = Pattern.compile("^[A-ZÁÉÍÓÚÑa-záéíóúñ]{2,}[1-2][0-9][0-9][0-9]$");
        Matcher m = p.matcher(nombre);
        if (m.matches()) {

            System.out.println("Usuario correcto");
            return nombre;

        } else {
            System.out.println("Formato incorrecto, el formato debe ser (NombreusuarioXXXX)");
            nombre = "ErrorDeNombre";
            return nombre;
        }

    }

    public static String PideContra() {
        Scanner teclado = new Scanner(System.in);
        
        String contra = "";
        System.out.println("Introduce la nueva contraseña(8 digitos)");
        contra = teclado.nextLine();
        Pattern p = Pattern.compile("^[0-9A-ZÁÉÍÓÚÑa-záéíóúñ@*-]{8,}$");
        Matcher m = p.matcher(contra);
        if (m.matches()) {

            System.out.println("Contraseña válida " + contra);
            return contra;

        } else {
            System.out.println("Formato incorrecto, el formato debe ser (8 digitos)");
            contra = "NULL";
            return contra;
        }
    }

}