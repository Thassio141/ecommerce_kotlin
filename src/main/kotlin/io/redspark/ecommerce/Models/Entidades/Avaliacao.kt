package io.redspark.ecommerce.Models.Entidades

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "avaliacao")
class Avaliacao (

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : UUID?,

    @ManyToOne(targetEntity = Usuario::class)
    val idUsuario : Usuario,

    @ManyToOne(targetEntity = Produto::class)
    val idProduto: Produto,

    val numeroAvaliacao: Int,

    val comentario : String
    )