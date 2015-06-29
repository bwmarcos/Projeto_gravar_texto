package arquivos;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ManipularTxt {
	
	public String gravarTxt(String caminhoArq, String conteudo){
		
		String msg=null;
		
		try {
			OutputStream out = new FileOutputStream(caminhoArq);
			OutputStreamWriter outWriter = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(outWriter);
			bw.write(conteudo);
			bw.flush();
			bw.close();
			msg = "Dados GRAVADOS";
		} catch (Exception e) {
			e.printStackTrace();
			msg="erro :" + e.getMessage();
			
			// TODO: handle exception
		}
		return msg;
	}
	public String obterTxt(String caminhoArq){
		String msg = null;
		StringBuilder sb = new StringBuilder();
		
		try {
			InputStream in = new FileInputStream(caminhoArq);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
		

}
