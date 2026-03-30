package com.example.biblioteca.mapper;

import com.example.biblioteca.model.Libro;
import com.example.biblioteca.dto.ClientRequest;

public class LibroMapper {
    public static Libro toModel(ClientRequest request) {
        return new Libro(
            request.getId(),
            request.getIsbn(),
            request.getTitulo(),
            request.getEditorial(),
            request.getFechaPublicacion(),
            request.getAutor()
        );
    }
}
