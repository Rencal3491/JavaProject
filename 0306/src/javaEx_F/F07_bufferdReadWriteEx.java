package javaEx_F;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.WriteAbortedException;

public class F07_bufferdReadWriteEx {

	public static void main(String[] args) {
		String htmlCode = "<html><head><sytle>\n";
		htmlCode += "div { \n" 
				 + "        widght:100px;\n"
				 + "       height:100px;\n"
				 + "        color:white;\n"
				 + "        background:red;\n"
				 + "        padding:50px;\n"
				 + "        font-size:40px;\n"
				 +"}\n";
		htmlCode += "</style>,</head><body>";
		htmlCode += "<div>Hello HTML!</div>";
		htmlCode += "</body></html>";
		String Path = "C:/FileTest/index.html";
		

	}
	public static void read(String path) {
		//String read(path)
		File f = new File(path);
		//입력객체 선언 
		FileReader fr =null;
		BufferedReader br = null;
		String code = null;
		//작업
		try {
			code = new String();
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String line = null;
			while((line = br.readLine()) != null) {
			System.out.println(line);
			code += line;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) br.close();
				if(fr!=null) fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
	}
}
