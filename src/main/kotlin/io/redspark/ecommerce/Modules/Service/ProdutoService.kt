package io.redspark.ecommerce.Modules.Service

import io.redspark.ecommerce.Models.Entidades.Produto
import io.redspark.ecommerce.Modules.Repository.ProdutoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.UUID


@Service
class ProdutoService {

    @Autowired
    private lateinit var produtoRepository: ProdutoRepository

    fun listarProdutos() : List<Produto>{
        return produtoRepository.findAll()
    }

    fun buscarProdutoPorId(id: UUID) : Produto{
        return produtoRepository.findById(id).orElseThrow()
    }

    fun createProdutos(produto: Produto) : Produto{
        return produtoRepository.save(produto)
    }

    fun updateProduto(id : UUID,produto: Produto) : Produto{
        val produtoEncontrado = produtoRepository.findById(id).orElseThrow()
        produtoRepository.save(produto)
        return produtoEncontrado
    }

    fun deleteProduto(id : UUID){
        produtoRepository.deleteById(id)
    }
}