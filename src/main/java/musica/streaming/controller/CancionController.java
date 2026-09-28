package musica.streaming.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import musica.streaming.service.CancionService;

@RestController
@RequestMapping ("/api/canciones")
public class CancionController {

@Autowired 
private CancionService service;
    
}
