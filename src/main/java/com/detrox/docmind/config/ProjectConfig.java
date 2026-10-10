package com.detrox.docmind.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI()
                .info(
                        new Info()
                        .title("DocMind-AI Document Intelligence & RAG Backend")
                                .description("REST API for DocMind: MultiFormat document" +
                                        " ingestion , vector embeddings with postgreSQL pgVector and hybrid" +
                                        " conversation")
                                .version("1.0.0")
                                .contact(new Contact()
                                        .name("Detrox")
                                        .email("support@detrox.com")
                                        )
                );
    }
}
