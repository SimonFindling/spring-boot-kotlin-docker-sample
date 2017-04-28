package de.fisi

/**
 * Created by SI_FI on 28.04.2017.
 */
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long> {

    fun findByLastName(lastName: String): Iterable<Customer>
}