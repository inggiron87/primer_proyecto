package org.umg.curso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alumno on 26/06/2017.
 */
public class Banco {
    public static void main(String[] args) throws IOException {
        //creando un objeto vacio con espacio en memoria reservado
        Cliente c = new Cliente();
        c.setNombre("Esteban");
        c.setEdad(30);
        c.setSalario(1520);

        //System.out.println("Estimado cliente: " + c.getNombre() + " Su salario será de: " + c.getSalario() );

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Su Nombre: ");
        c.setNombre(reader.readLine());
        System.out.println("Su Edad: ");
        c.setEdad(Integer.parseInt(reader.readLine()));
        System.out.println("Su salario: ");
        c.setSalario(Integer.parseInt(reader.readLine()));

        System.out.println("Estimado " +c.getNombre()+", su edad es " +c.getEdad()+ " y su salario será de: "+c.getSalario());

    }
}
