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
				switch (romano.charAt(i)) {
				case 'M':
					valorActual = logicaDeConversao(1000, valorActual, ultimoValor);
					ultimoValor = 1000;
					break;
					
				case 'D':
					valorActual = logicaDeConversao(500, valorActual, ultimoValor);
					ultimoValor = 500;
					break;
					
				case 'C':
					valorActual = logicaDeConversao(100, valorActual, ultimoValor);
					ultimoValor = 100;
					break;
					
				case 'L':
					valorActual = logicaDeConversao(50, valorActual, ultimoValor);
					ultimoValor = 50;
					break;
					
				case 'X':
					valorActual = logicaDeConversao(10, valorActual, ultimoValor);
					ultimoValor = 10;
					break;
					
				case 'V':
					valorActual = logicaDeConversao(5, valorActual, ultimoValor);
					ultimoValor = 5;
					break;
					
				case 'I':
					valorActual = logicaDeConversao(1, valorActual, ultimoValor);
					ultimoValor = 1;
					break;

				default:
					break;
				}
			}
		}
		
		return valorActual;
	}
	
	public int logicaDeConversao(int valorActual, int valorAnterior, int ultimoValor){
		
		if(ultimoValor > valorActual){
			return ultimoValor - valorActual;
		}
		else{
			return ultimoValor + valorActual;
		}
	}
}
