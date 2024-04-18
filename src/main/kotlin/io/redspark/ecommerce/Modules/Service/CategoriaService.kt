package io.redspark.ecommerce.Modules.Service

import io.redspark.ecommerce.Models.Entidades.Categoria
import io.redspark.ecommerce.Models.Entidades.Produto
import io.redspark.ecommerce.Modules.Repository.CategoriaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class CategoriaService {

    @Autowired
    private lateinit var categoriaRepository: CategoriaRepository

    fun listarCategorias() : List<Categoria> {
        return categoriaRepository.findAll()
    }

    fun buscarCategoriaPorId(id: UUID) : Categoria {
        return categoriaRepository.findById(id).orElseThrow()
    }

    fun criarCategoria(categoria: Categoria) : Categoria {
        return categoriaRepository.save(categoria)
    }

    fun updateCategoria(id : UUID,categoria: Categoria) : Categoria {
        return categoriaRepository.save(categoria)
    }

    fun deleteCategoria(id: UUID) {
        return categoriaRepository.deleteById(id)
    }
}