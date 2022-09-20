package com.platzi.market.platzimarket.persistence.crud;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.platzi.market.platzimarket.persistence.entity.Producto;

//Remove @RepositoryRestResource below to disable auto REST api:
// @RepositoryRestResource
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{
    // @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
