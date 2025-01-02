package com.eb2.bloggingplatformapi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Erick",
                        email = "contact@erick.com"
                ),
                description = "OpenApi documentation for API Blogging",
                title = "OpenApi specification - erick",
                version = "1.0",
                license = @License(
                        name = "License",
                        url = "https://any.come"
                ),
                termsOfService = "TyS"
        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8080"
                )
        }
)
public class OpenApiConfig {
}
