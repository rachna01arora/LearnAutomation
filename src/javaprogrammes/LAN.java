package javaprogrammes;

import java.io.File;
import java.io.IOException;
import java.lang.Runtime; 

public class LAN {
	
	public static void main(String[] args) throws IOException{
		{
		//Process run = Runtime.getRuntime().exec("cmd.exe", "");
		//Process p =  Runtime.getRuntime().exec("cmd /c run.bat", null, new File("C:\\LAN\\workspace"));
		ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "run.bat");
		File dir = new File("C:\\LAN\\workspace");
		pb.directory(dir);
		Process p = pb.start();
}
}
}
