package com.example.biblioteca.repository;
import org.springframework.stereotype.Repository;

import com.example.biblioteca.model.Libro;
import java.util.List;
import java.util.ArrayList;

@Repository
public class LibroRepository {
    private List<Libro> listaLibros = new ArrayList<>();

    public Libro buscarPorId(int id){
        for(Libro lib: listaLibros){
            if(lib.getId() == id){
                return lib;
            }
        }
        return null;
    }

    
    public Libro buscarPorIsbn(String isbn){
        for(Libro lib: listaLibros){
            if(lib.getIsbn().equals(isbn)){
                return lib;
            }
        }
        return null;
    }

    public List<Libro> obtenerLibros(){
        return listaLibros;
    }


    public Libro guardar(Libro lib) {
//        Libro libro = new Libro();
//        libro.setId(lib.getId());
//        libro.setIsbn(lib.getIsbn());
//        libro.setTitulo(lib.getTitulo());
//        libro.setAutor(lib.getAutor());
//        libro.setFechaPublicacion(lib.getFechaPublicacion());
//        libro.setEditorial(lib.getEditorial());

        listaLibros.add(lib);
        return lib;
    }

    public Libro actualizar(Libro lib) {
        int id  = 0;
        int idPosicion = 0;

        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getId() == lib.getId()) {
                id = lib.getId();
                idPosicion = i;
            }
        }

        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setEditorial(lib.getEditorial());
        libro1.setIsbn(lib.getIsbn());

        listaLibros.set(idPosicion, libro1);
        return libro1;
    }

    public void eliminar(int id){
        Libro lib = buscarPorId(id);
        if(lib != null){
            listaLibros.remove(lib);
        }
    }

    // METODO SACADO DEL REPO DEL PROFE
    public int totalLibros(){
        return listaLibros.size();
    }
}
