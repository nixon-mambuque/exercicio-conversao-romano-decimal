package mz.nixon.mambuque.conversor;

public class ConversorDeRomanoParaDecimal {
	
	public int converte(String romano){
		
		if(romano.length()==1){
			return (int) (Math.floor(Math.pow(10, "IXCM".indexOf(romano.charAt(0))))+
					5*Math.floor(Math.pow(10, "VLD".indexOf(romano.charAt(0)))));
		}
		
		return 0;
	}
}
