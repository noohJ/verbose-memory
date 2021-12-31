package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E04_Copy {
	/*
	 		practice ���� ������ ��� ������ practice_copy������ �����غ�����	  
	 		�Ǵ� easy���� ������ ��� ������ easy_copy������ �����ϼ���
	 */

	File src;

	File root;
	
	public E04_Copy(String src) {
		int sep = src.indexOf('\\');
		this.root = new File(getRootName(src)+ "_copy");
		this.src = new File(src);

	}
	private String getRootName (String path) {
		int sep = path.indexOf('\\');
		return path.substring(0, sep == -1? path.length():sep);
	}
	private String getDstPath(File f) {
		// practice\students\abc.txt
		String path = f.getPath();
		String root = getRootName(path);
		
		
		return path.replace(root, root+"_copy");
	}
	private File getDstFile(File f) {
		// practice\students\abc.txt
		String path = f.getPath();
		String root = getRootName(path);				
		return new File(path.replace(root, root+"_copy"));
	}
		
	public void copy() {
		File parent;
		if (!(parent = getDstFile(src.getParentFile())).exists()) {
			parent.mkdirs();
		}
		
		for (File f : src.listFiles()) {
			System.out.println(f);
			
			if (f.isFile()) {
				try (
						FileInputStream in = new FileInputStream(f);
						FileOutputStream out = new FileOutputStream(new File (getDstPath(f)));
//						FileReader in = new FileReader(f,Charset.forName("UTF-8"));
//						FileWriter out = new FileWriter(new File(getDstPath(f)),Charset.forName("UTF-8"));
				){
					out.write(in.readAllBytes());
//					char[] buff = new char[1024];
//					
//					int len;
//					while((len = in.read(buff)) != -1) {
//						out.append(new String(buff,0,len));
//					}
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}				
			}else {
				new E04_Copy(f.getPath()).copy();
			}
		}
	}
	
	public static void main(String[] args) {
		E04_Copy copy = new E04_Copy("practice");
		copy.copy();
		
	}
	
}
