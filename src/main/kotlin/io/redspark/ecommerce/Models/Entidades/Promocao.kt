package io.redspark.ecommerce.Models.Entidades

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

        val descricao : String
)
