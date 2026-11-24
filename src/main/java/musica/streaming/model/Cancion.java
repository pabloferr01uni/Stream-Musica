package musica.streaming.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data //Genera los Getters y Setters para leer y modificar cada atributo, tambien modifica el toString para poder imprimir el objeto como texto, tambien el equals y hascode
@NoArgsConstructor // Permite crear el objeto sin declarar los atributos con los setters
@AllArgsConstructor // Este crea el objeto con todos los atributos

public class Cancion {
    
private Long id;
private String titulo;
private String artista;
private String genero;
private int anioLanzamiento;
private int duracionSegundos;
private long reproducciones;

}
