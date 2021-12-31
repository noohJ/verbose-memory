package quiz;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E06_RegistReporter2 {
	
	public static void main(String[] args) {
		File path = new File("practice/email/reporters");
		if(!path.exists()) {
			path.mkdir();
		}
		File emails = new File("practice/email/email.txt");
		
		try(
				BufferedReader in = 
					new BufferedReader(new FileReader(emails,Charset.forName("UTF-8")));			
				) {
			Pattern pattern = Pattern.compile("(.*)\t(.*)\t(.*)\t(\\w+@\\w+\\.\\w+(\\.\\w+)*)");
			
			String allData = "";
			char[] cbuf = new char[8192];
			int len;
			while ((len = in.read(cbuf)) != -1) {
				allData += new String(cbuf,0,len);
			}
			Matcher matcher = pattern.matcher(allData);
			
			while (matcher.find()) {
				String company = matcher.group(1);
				String field = matcher.group(2);
				String name =matcher.group(3);
				String email = matcher.group(4);
				try(
					DataOutputStream out = 
						new DataOutputStream(new FileOutputStream(
								new File( path, String.format("%s_%s.txt",company,name))));
				){
					out.writeUTF(company+"\n");
					out.writeUTF(field+"\n");
					out.writeUTF(name+"\n");
					out.writeUTF(email+"\n");
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();		
		}
		
	}

}
