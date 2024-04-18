package io.redspark.ecommerce.Models.Entidades

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "promocao")
class Promocao(
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera id autoincrementavel
        val id : UUID?,

        val nome : String,

        val valorDesconto : Double,

        val quantidade : Int,

        val descricao : String,

        @ManyToOne(targetEntity = Produto::class)
        val idPromocao: Produto
)
