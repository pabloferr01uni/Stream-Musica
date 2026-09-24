package musica.streaming.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import musica.streaming.model.Cancion;

@Repository

public class CancionRepository {
    private List<Cancion>baseDeDatos = new ArrayList<>();
    private Long contadorId=1L; //Agrego la L ya que si no tiraria erro al ingresar un numero tan bajo en Long.


    //Metodos

    //Guardar Cancion

    public Cancion guardar (Cancion cancion){
        cancion.setId(contadorId);
        contadorId++;
        baseDeDatos.add(cancion);
        return cancion;
    }

    //Ver todas las canciones

    public List<Cancion> obtenerTodas(){
        return baseDeDatos;
    }
}
