package io.redspark.ecommerce.Models.Entidades

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "categoria")
class Categoria(
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera id autoincrementavel
        val id : UUID?,

        val nome : String
)