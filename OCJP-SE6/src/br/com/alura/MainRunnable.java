package br.com.alura;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MainRunnable {

	public static void main(String[] args) throws IOException  {
	
		InputStream path =  new FileInputStream("C:\\Users\\lucas.carvalho\\Pictures\\Saved Pictures\\a1.jpg");
		
		moverArquivo("12","12","12","12", "12", new File("C:\\Users\\lucas.carvalho\\Pictures\\Saved Pictures\\a1.jpg"));
		
		
}	
	
	static  void moverArquivo(String marca, String base, String day, String month, String year, File arquivoBaixado) {
		   
		  //  String nome = this.data.format(this.formatarData("dia")) + ".xls";
		    arquivoBaixado.renameTo( arquivoBaixado );
		    if (arquivoBaixado.isDirectory()) {
		        for (final File arq : arquivoBaixado.listFiles()) {
		            try {
		                if (arq.isFile() && arq.getName().substring(arq.getName().lastIndexOf('.') + 1).contains("xls")) {
		                    String fileName = arq.getName();
		                    if (fileName.contains("xls")) {
		                       // System.out.println(caminhoServidor);
		                       // Files.move(arq.toPath(), Paths.get(caminhoServidor, fileName), REPLACE_EXISTING);
		                    }
		                }
		            } catch (Exception e) {
		                e.printStackTrace();
		            }
		        }
		    }
		}
	 
}