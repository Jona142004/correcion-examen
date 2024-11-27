package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Carross.
 * 
 * 
 * Generar los metdoos necesarions para ordenar un array de personas por edad en
 * orden descendente
 * y para la busqueda binaria de una persona por edad.
 * 
 */
public class PersonaController {
    public Persona[] selección(Persona[] personas){
        for (int i = 0; i < personas.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < personas.length; j++) {
                if (personas[j].getEdad() > personas[min].getEdad()) {
                    min = j;
                }
            }
        Persona aux = personas[min];
        personas[min] = personas[i];
        personas[i] = aux;
        }
        return personas;
    }
    public int busquedaBiPersona(Persona[] personas,  int objetivo){
        int inicio = 0;
        int fin = personas.length -1;
        while (inicio <= fin) {
            int medio =  inicio  + (fin - inicio)/2;
            if (personas[medio].getEdad() == objetivo) {
                return medio;
            }
            if(personas[medio].getEdad() > objetivo){
                inicio = medio +1;
            }else{
                fin = medio - 1;
            }
            
        }

        return -1;
    }
    public Persona [] insercion(Persona [] personas){
        for (int i = 1; i < personas.length; i++) {
            Persona min = personas[i];
            int j = i -1;
            while (j >= 0 && personas[j].getNombre().compareTo(min.getNombre()) > 0) {
                personas[j + 1] = personas[j];
                -- j;
                
            } 
        personas[j + 1] = min;
            
        }
        return personas;
    }
    public int busquedaBiPersonaN(Persona[] personas,  String objetivo){
        int inicio = 0;
        int fin = personas.length -1;
        while (inicio <= fin) {
            int medio = (inicio + fin)/2;
            int comparacion = personas[medio].getNombre().compareTo(objetivo);
            if (comparacion == 0) {
                return medio;
            }
            if(comparacion < 0){
                inicio = medio +1;
            }else{
                fin = medio - 1;
            }
            
        }

        return -1;
    }
}
