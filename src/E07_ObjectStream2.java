import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class E07_ObjectStream2 {
	public static void main(String[] args) {
		
		File f = new File("practice/object.txt");
		
		try(
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));	
		){
			Apple a = (Apple)(in.readObject());
			System.out.println(a.size);
			System.out.println(a);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
