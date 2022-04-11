package talks.timepersistence.server

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class CorsConfig : WebMvcConfigurer {

    override fun addCorsMappings(registry: CorsRegistry) {
        registry
            .addMapping("/simple")
            .allowedOrigins("*")
            .allowedMethods("*")
            .allowedHeaders("*")
            .exposedHeaders("*")
            .allowCredentials(false)
        registry
            .addMapping("/strict")
            .allowedOrigins("http://localhost:8080")
            .allowedMethods("GET", "POST")
            .allowedHeaders("Authorization")
            .allowCredentials(true)
    }
}
