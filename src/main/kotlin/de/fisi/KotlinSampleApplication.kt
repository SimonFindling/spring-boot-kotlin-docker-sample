package de.fisi

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinSampleApplication {
    @Bean
    fun init(repository: CustomerRepository) = CommandLineRunner {
        // save a couple of customers
        repository.save(Customer("Jack", "Bauer"))
        repository.save(Customer("Chloe", "O'Brian"))
        repository.save(Customer("Kim", "Bauer"))
        repository.save(Customer("David", "Palmer"))
        repository.save(Customer("Michelle", "Dessler"))
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSampleApplication::class.java, *args)
}
