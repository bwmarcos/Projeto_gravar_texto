package arquivos;

import java.io.File;

public class ManipularArquivo {
	
	public void criarDiretorio(String caminho){
		
		File dir = new File(caminho);
		
		if(dir.mkdirs()){
			System.out.println("Diretorio Criado");
		}else{
			System.out.println("Erro ao criar diretorio");
		}
	}
	
	public void criarArquivo(String caminho, String nomeArq){
		File arq = new File(caminho, nomeArq);
		
		try {
			arq.createNewFile();
			System.out.println("Arquivo criado");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro :" +e.getMessage());
			
			// TODO: handle exception
		}
	}

}
