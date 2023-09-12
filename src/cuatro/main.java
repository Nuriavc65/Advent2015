package cuatro;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class main {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String data = "yzbqklnj";
		int numeros = 0;
		while (true) {
			numeros++;
			String dataDos = data +numeros;
			byte[] bytesOfMessage = dataDos.getBytes("UTF-8");
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] theMD5digest = md.digest(bytesOfMessage);
			if(theMD5digest [0]==0 && 
					theMD5digest[1] == 0 &&
					theMD5digest[2] == 0 &&
					theMD5digest[3] == 0 &&
					theMD5digest[4] == 0) {
				System.out.println(numeros);
				break;
			}
			
		}
		
						
	}

}
