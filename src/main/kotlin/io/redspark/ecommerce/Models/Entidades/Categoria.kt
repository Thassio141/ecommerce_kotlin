package io.redspark.ecommerce.Models.Entidades

@Entity
@Table(name = "categoria")
class Categoria(
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera id autoincrementavel
        val id : UUID?,

        val nome : String
)