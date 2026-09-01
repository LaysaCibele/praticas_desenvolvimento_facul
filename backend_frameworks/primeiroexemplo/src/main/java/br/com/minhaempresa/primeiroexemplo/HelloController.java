package br.com.minhaempresa.primeiroexemplo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //útil para o spring reconhecer como controller
public class HelloController {

    @GetMapping("/") //ou post<appping com a URl que quero atender
    public String Hello()  {
        return "Bem-vindo ao Spring Boot";
    }
    
}