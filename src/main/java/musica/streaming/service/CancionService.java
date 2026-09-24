package musica.streaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import musica.streaming.repository.CancionRepository;
import musica.streaming.model.Cancion;
@Service

public class CancionService {

@Autowired

private CancionRepository repository;

public Cancion agregarCancion(Cancion nuevaCancion){

    return repository.guardar(nuevaCancion);
}

public List<Cancion> obtenerTodasLasCanciones(){
    return repository.obtenerTodas();
}

    
}
