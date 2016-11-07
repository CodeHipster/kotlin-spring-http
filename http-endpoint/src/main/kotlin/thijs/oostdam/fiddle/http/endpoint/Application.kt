package thijs.oostdam.fiddle.http.endpoint

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

/**
 * Created by Thijs on 6-11-2016.
 */
@SpringBootApplication
open class Application{

    @Bean
    open fun init() = CommandLineRunner {System.out.println("initializing!")}

}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
