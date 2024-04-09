package io.redspark.ecommerce.Models.Entidades

import jakarta.persistence.*
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@Table(name = "usuario")
open class Usuario (

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera id autoincrementavel
        val id : UUID?,

        @Column(name = "nome")
        var nome: String,

        @Column(name = "cpf")
        var cpf: String,

        @Column(name = "email")
        var email: String,

        @Column(name = "senha")
        val senha: String,

//        @Column(name = "id_enderco")
//        val id_ebdereco: Endereco,

        @Column(name = "telefone")
        val telefone: String){
}