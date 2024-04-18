package io.redspark.ecommerce.Modules.Controller

import io.redspark.ecommerce.Models.Entidades.Produto
import io.redspark.ecommerce.Modules.Service.ProdutoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.UUID

@RestController
@RequestMapping("produtos")
class ProdutoController {

    @Autowired
    private lateinit var produtoService: ProdutoService

    @GetMapping
    fun listar() : ResponseEntity<List<Produto>>{
        return ResponseEntity(produtoService.listarProdutos(), HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable("id") id : UUID) : ResponseEntity<Produto>{
        return ResponseEntity(produtoService.buscarProdutoPorId(id), HttpStatus.OK)
    }

    @PostMapping
    fun criarProduto(@RequestBody produto : Produto) : ResponseEntity<Produto>{
        return ResponseEntity(produtoService.createProdutos(produto), HttpStatus.CREATED)
    }

    @PutMapping("/{id}")
    fun atualizarProduto(@PathVariable("id") id : UUID,produto: Produto) : ResponseEntity<Produto>{
        return ResponseEntity(produtoService.updateProduto(id,produto),HttpStatus.OK)
    }

    @DeleteMapping
    fun deleteProduto(@PathVariable("id") id : UUID) : ResponseEntity<String>{
        return ResponseEntity(produtoService.deleteProduto(id).toString(), HttpStatus.NO_CONTENT)
    }
}