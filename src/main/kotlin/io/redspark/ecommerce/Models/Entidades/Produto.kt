package io.redspark.ecommerce.Models.Entidades

import jakarta.persistence.*
import java.sql.Blob
import java.util.*
import kotlin.collections.HashSet

@Entity
@Table(name = "produto")
class Produto(
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera id autoincrementavel
        val id : UUID?,

        val nome : String,

        val valor : Double,

        val quantidade : Int,

        val descricao : String,

        val idCategoria : Categoria,

        val idPromocao : Promocao,

        val idAvalicao : HashSet<Avaliacao>,

        val imagem : ByteArray
)