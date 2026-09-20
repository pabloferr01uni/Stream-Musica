package musica.streaming.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cancion {
    
private Long id;
private String titulo;
private String artista;
private String genero;
private int anioLanzamiento;
private int duracionSegundos;
private long reproducciones;

}
