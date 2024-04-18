package io.redspark.ecommerce.Modules.Repository

import io.redspark.ecommerce.Models.Entidades.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UsuarioRepository : JpaRepository<Usuario, UUID> {
}