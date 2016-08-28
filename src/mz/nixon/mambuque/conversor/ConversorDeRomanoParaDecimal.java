package mz.nixon.mambuque.conversor;

public class ConversorDeRomanoParaDecimal {
	
	public int converte(String romano){
		
		int valorActual = 0;
		int ultimoValor = 0;
		if(romano.length()==1){
			return (int) (Math.floor(Math.pow(10, "IXCM".indexOf(romano.charAt(0))))+
					5*Math.floor(Math.pow(10, "VLD".indexOf(romano.charAt(0)))));
		}
		
		else{
			
			for(int i = romano.length()-1; i >= 0 ; i--){
				switch (romano.toUpperCase().charAt(i)) {
				case 'M':
					ultimoValor = logicaDeConversao(1000, valorActual, ultimoValor);
					valorActual = 1000;
					break;
					
				case 'D':
					ultimoValor = logicaDeConversao(500, valorActual, ultimoValor);
					valorActual = 500;
					break;
					
				case 'C':
					ultimoValor = logicaDeConversao(100, valorActual, ultimoValor);
					valorActual = 100;
					break;
					
				case 'L':
					ultimoValor = logicaDeConversao(50, valorActual, ultimoValor);
					valorActual = 50;
					break;
					
				case 'X':
					ultimoValor = logicaDeConversao(10, valorActual, ultimoValor);
					valorActual = 10;
					break;
					
				case 'V':
					ultimoValor = logicaDeConversao(5, valorActual, ultimoValor);
					valorActual = 5;
					break;
					
				case 'I':
					ultimoValor = logicaDeConversao(1, valorActual, ultimoValor);
					valorActual = 1;
					break;

				default:
					break;
				}
			}
		}
		
		return ultimoValor;
	}
	
	public int logicaDeConversao(int valorActual, int valorAnterior, int ultimoValor){
		
		if(valorAnterior > valorActual){
			return ultimoValor - valorActual;
		}
		else{
			return ultimoValor + valorActual;
		}
	}
}
