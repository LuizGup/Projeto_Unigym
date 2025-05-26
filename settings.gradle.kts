pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google() // Certifique-se que google() está aqui
        mavenCentral()
        // Adicione o repositório Maven do Google AI aqui, se necessário (geralmente google() é suficiente)
        // maven { url = uri("https://maven.google.com/") } // Alternativa se google() não funcionar
    }
}

rootProject.name = "Unigym"
include(":app")
 