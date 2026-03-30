package com.example.biblioteca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.biblioteca.repository.LibroRepository;
import com.example.biblioteca.model.Libro;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepo;

    public List<Libro> getLibros(){
        return libroRepo.obtenerLibros();
    }

    public Libro saveLibro(Libro lib){
        return libroRepo.guardar(lib);
    }

    public Libro getLibroId(int id){
        return libroRepo.buscarPorId(id);
    }

    public Libro updateLibro(Libro lib){
        return libroRepo.actualizar(lib);
    }

    public String deleteLibro(int id){
        libroRepo.eliminar(id);
        return "Libro Eliminado!";
    }

    // METODOS SACADOS DEL REPO DEL PROFE
    public int totalLibros(){
        return libroRepo.obtenerLibros().size();
    }

    public int totalLibrosV2(){
        return libroRepo.totalLibros();
    }
}
