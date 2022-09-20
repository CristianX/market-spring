package com.platzi.market.platzimarket.persistence;

import java.util.List;
import java.util.Optional;

import com.platzi.market.platzimarket.persistence.crud.ProductoCrudRepository;
import com.platzi.market.platzimarket.persistence.entity.Producto;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();

    }

    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }
    
}
