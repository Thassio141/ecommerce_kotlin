package io.redspark.ecommerce.Modules.Controller

import io.redspark.ecommerce.Models.Entidades.Categoria
import io.redspark.ecommerce.Modules.Service.CategoriaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/categorias")
class CategoriaController {

    @Autowired
    private lateinit var categoriaService : CategoriaService

    @GetMapping
    fun listar() : ResponseEntity<List<Categoria>> {
        return ResponseEntity(categoriaService.listarCategorias(),HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun buscar(@PathVariable("id") id : UUID) : ResponseEntity<Categoria> {
        return ResponseEntity(categoriaService.buscarCategoriaPorId(id),HttpStatus.OK)
    }

    @PostMapping
    fun create(@RequestBody categoria: Categoria) : ResponseEntity<Categoria> {
        return ResponseEntity(categoriaService.criarCategoria(categoria), HttpStatus.CREATED)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id : UUID ,@RequestBody categoria: Categoria) : ResponseEntity<Categoria> {
        return ResponseEntity(categoriaService.updateCategoria(id, categoria), HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id : UUID) : ResponseEntity<Any> {
        return ResponseEntity(categoriaService.deleteCategoria(id),HttpStatus.NO_CONTENT)
    }
}