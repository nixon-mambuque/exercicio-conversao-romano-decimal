package mz.nixon.mambuque.conversorController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConversorController {
	
	@RequestMapping("/conversor")
	public String converte(){
		System.out.println("Executando a lógica String MVC");
		return "conversor";
	}
	
	@RequestMapping("/converte")
	public String convertendo(){
		return "resultadosConversor";
	}
}
