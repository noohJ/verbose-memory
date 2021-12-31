package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E06_RegistReporter {
	/*
	  	emails.txt에 나열되어있는 모든 기자들의 정보를 통해
	  	practice/reporters 디렉토리에 각 기자들의 정보를 담고 있는 파일들을 마들어 보세요.
	 */
	static File ef = new File("practice/email/email.txt");
	
	public static ArrayList list() {
		try(
			BufferedReader in = new BufferedReader(new FileReader(ef,Charset.forName("UTF-8")));	
		){
			ArrayList<String> split_imp = new ArrayList<>();
			String line;
			while ((line = in.readLine()) != null) {
				split_imp.add(line);
			}
			return split_imp;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		for(int i = 0; i <list().size();++i) {
			String company = "",department = "",name="",email="";
			String imp = (String) list().get(i);
			Pattern pattern= Pattern.compile("(\\S+)(\\s)");
			Pattern emailPattern = Pattern.compile("(\\w+)@(\\w+\\.\\w+(\\.\\w+)*)");
			Matcher matcher = pattern.matcher(imp);
			Matcher emailMatcher = emailPattern.matcher(imp);
			int w =imp.lastIndexOf("	");
			if (matcher.find()) {
				company += matcher.group(1);				
			}
			if (matcher.find()) {
				department += matcher.group(1);				
			}
			if (matcher.find()) {
				name += matcher.group(1);				
			}
			if (emailMatcher.find()) {
				email += emailMatcher.group(0); 				
			}
			
			String file_names = company+"_"+imp.substring(w-3,w).trim();

			File f1 = new File("practice/email/"+file_names+".txt");
			try(
					BufferedWriter out = new BufferedWriter(new FileWriter(f1));
			) {
				out.write("회 사 명 : "+company+"\n");
				out.write("부 서 명 : "+department+"\n");
				out.write("이   름 : "+name+"\n");
				out.write("이 메 일 : "+email+"\n");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
