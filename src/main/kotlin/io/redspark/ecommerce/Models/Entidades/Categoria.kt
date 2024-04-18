package io.redspark.ecommerce.Models.Entidades

import jakarta.persistence.*
import java.util.*
import kotlin.collections.HashSet

@Entity
@Table(name = "categoria")
class Categoria(
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera id autoincrementavel
        val id : UUID?,

        val nome : String,

        @OneToMany(targetEntity = Produto::class)
        val produto: HashSet<Produto>
)