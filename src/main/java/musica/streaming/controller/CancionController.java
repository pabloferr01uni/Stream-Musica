package musica.streaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import musica.streaming.model.Cancion;
import musica.streaming.service.CancionService;

@RestController // Habilita las peticiones web y que lo que devuelvan sus metodos se va a convertir  en JSON
@RequestMapping ("/api/canciones") //Define la ruta base, es decir, la ruta principal URL
public class CancionController {

@Autowired 
private CancionService service;
 
@GetMapping 

public List<Cancion> obtenerTodas(){
    return  service.obtenerTodasLasCanciones();
}

@PostMapping 

public Cancion agregarCancion (@RequestBody  Cancion cancion){
    return  service.agregarCancion(cancion);
}

}
