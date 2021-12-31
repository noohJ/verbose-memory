import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	/*
	  	# ����ǥ���� (Regular Expression)
	  	
	  	 - ���ڿ��� �������� �˻��� �� �ִ� ǥ����
	  	 - Ư�� ���α׷��� ���� �ִ°��� �ƴ� ������ ��Ģ
	  	 - ������ ���ڿ� ���ϰ� ��ġ�ϴ� ���ڿ��� �ɷ��� �� �ִ�.
	  	 
	  	# Java���� ����ǥ������ �ٷ� �� ����ϴ� Ŭ����
	  	
	  	 - Pattern
	  	 - Matcher	  
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Pattern.matches(regex, input): input��  regex�� ��ġ�ϴ� ���ڿ����� �˻��Ѵ�.
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh]ee[pk]", "saeep"));
		System.out.println(Pattern.matches("s[lh]ee[ABCDEFGpk]", "sleeG"));
		
		/*
		  	[abc] : a,b,c ��� 
		  	[a-z] : a����z���� ��� ���
		  	[A-G] : A����G���� ��� ����
		  	[\\-]: �������ø� �����ϸ� escape������ �ϰ� �ȴ�.
		  	[a-e&&c-z]:a-e�� c-z�� ��� ������Ű�� ���ڸ� ��� (������)
		 */
		System.out.println(Pattern.matches("[a-d&&b-f]","d"));
		
		/*
		  	# �ϳ��� ���� ���ڸ� ��Ÿ���� �͵�
		  	
		  	.  : ��� ����
		  	\\d : ��� ����
		  	\\D : ���ڸ� ������ ���� 		  
		  	\\s : ��� ����(\t, \n \r, )
		  	\\S : ������ ������ ����
		  	\\w : �Ϲ����� ���ڵ��� ���[a-zA-Z0-9_]
		  	\\W : \w�� ������ ��� �� 
		  	
		 */
		System.out.println(Pattern.matches("...","dqs"));
		System.out.println(Pattern.matches("\\d..","4qs"));
		System.out.println(Pattern.matches("[\\Da]..","dqs"));
		System.out.println(Pattern.matches("\\d\\s..","4 qs"));
		System.out.println(Pattern.matches("\\d\\s..","4\nqs"));
		System.out.println(Pattern.matches("\\w..","_qs"));
		
		/*
		  	# �ش� ������ ����� ������ ������ �����ϴ� ���
		  	
		  	 .{n}: {}���� ������ n�� ��ġ�ؾ��Ѵ�.
		  	 .{n,m}: {}���� ������ �ּ� n�� �ִ� m�� ��ġ�ؾ� �Ѵ�.
		  	 .{n,}: {}���� ������ �ּ� n�� �̻� ��ġ�ؾ� �Ѵ�.
		  	 .? : ? ���� ������ 0�� �Ǵ� �ѹ� ���;� �Ѵ�.
		  	 .+ : + ���� ������ �ּ�1�� �̻� ���;� �Ѵ�.
		  	 .* : * ���� ������ 0�� �̻� ���;� �Ѵ�.
		 */
		System.out.println(Pattern.matches(".{5}","12345"));
		System.out.println(Pattern.matches("\\D{8}", "@#$Dsa#!"));
		System.out.println(Pattern.matches("\\d{2,4}", "2222"));
		System.out.println(Pattern.matches("\\d{5,}", "2222222222"));
		System.out.println(Pattern.matches("abc\\d?", "abc2"));
		System.out.println(Pattern.matches("abc\\d+", "abc5"));
		System.out.println(Pattern.matches("abc\\d*", "abc"));
		// �ش� ���ڿ��� �ڵ��� ��ȣ���� �˻��� �� �ִ� ����ǥ������ ������
//		System.out.println("��ȣ)���ڿ� �Է� > ");
//		String chk = sc.next();
//		System.out.println((Pattern.matches("[0][1][0-9]\\d{8}", chk))||(Pattern.matches("[0][1][0-9]-\\d{4}-\\d{4}", chk)));
//		
//		System.out.println("�̸���)���ڿ� �Է� > ");
////		String chk2 = sc.next();
//		String chk2 = "abc@naver.co.";
//		System.out.println((Pattern.matches("\\w{1,}@[a-zA-Z0-9]{1,}\\.[a-zA-Z0-9]{1,}", chk2))||
//				(Pattern.matches("\\w{1,}@[a-zA-Z]{1,}\\.[a-zA-Z0-9]{1,}\\.[a-zA-Z0-9]{1,}", chk2)));
		
		
		// Matcher Ŭ������ �� ���ڿ� �˻��ϱ�
		String fruits = "apple/banana/kiwi/mango/pineapple/banana/redapple/greenapple/apple";
		
		// 1. ���� ǥ������ �������� �ν��Ͻ��� ����
		Pattern pattern = Pattern.compile("(\\w+)(apple)");
		
		// 2. �������س��� ����ǥ�������� ���ϴ� ���ڿ��� �˻��ϱ����� Matcher �ν��Ͻ��� ��ȯ�ȴ�
		Matcher matcher =pattern.matcher(fruits);
		
		while (matcher.find()) {
			System.out.println("--------------------");
			System.out.println("ã�� ��: " + matcher.group(1));
			System.out.println("ã������ ���� ��ġ: " + matcher.start(1));
			System.out.println("ã������ ������ ��ġ: " + matcher.end(1));
		}
	}
}
