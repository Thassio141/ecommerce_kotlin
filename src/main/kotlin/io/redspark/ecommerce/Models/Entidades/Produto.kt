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

        @ManyToOne(targetEntity = Categoria::class)
        val idCategoria : Categoria,

        @ManyToOne(targetEntity = Promocao::class)
        val idPromocao : Promocao,

        @OneToMany(targetEntity = Avaliacao::class)
        val idAvalicao : HashSet<Avaliacao>,

        val imagem : ByteArray
)