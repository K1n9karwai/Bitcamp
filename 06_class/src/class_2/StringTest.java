package class_2;

public class StringTest {

	public static void main(String[] args) {

		String a = "apple"; // literal ����
		String b = "apple";
		if (a == b)
			System.out.println("a�� b�� �������� ����.");
		else
			System.out.println("a�� b�� �������� �ٸ���.");
		if (a.equals(b))
			System.out.println("a�� b�� ���ڿ��� ����.");
		else
			System.out.println("a�� b�� ���ڿ��� �ٸ���.");
		System.out.println();

		String c = new String("apple");
		String d = new String("apple");
		if (c == d)
			System.out.println("c�� d�� �������� ����.");
		else
			System.out.println("c�� d�� �������� �ٸ���.");
		if (c.equals(d))
			System.out.println("c�� d�� ���ڿ��� ����.");
		else
			System.out.println("c�� d�� ���ڿ��� �ٸ���.");
		System.out.println();

		String e = "���� ��¥�� " + 2019 + 12 + 30;
		System.out.println("e = " + e);
		/*
		 * ���ڿ��� ������ �ȵǹǷ� ���� �� ���, �޸𸮸� 4�� �����ϰ� �ȴ�.
		 * JVM�� ���ؼ� ���� �� Garbage Collector�� ������.
		 * Garbage Collector�� ����Ǹ� ��ǻ�ʹ� �����.
		 * "���� ��¥�� "
		 * "���� ��¥�� 2019"
		 * "���� ��¥�� 201912"
		 * e ---> "���� ��¥�� 20191230"
		 */
		
		
		// �̱���
		// - ����ؼ� new X
		//   �� �ѹ��� new
		// - �̱����� �Ϸ��� static ����
		
		System.out.println("���ڿ� ũ�� = " + e.length());
		
		for(int i=0; i<e.length(); i++) {
			System.out.println(i + " : " + e.charAt(i));
		}
		
		System.out.println("�κ� ���ڿ� ���� = " + e.substring(7));
		System.out.println("�κ� ���ڿ� ���� = " + e.substring(7, 11));
		
		System.out.println("�빮�� ���� = " + "Hello".toUpperCase());
		System.out.println("�ҹ��� ���� = " + "Hello".toLowerCase());
		
		System.out.println("���ڿ� �˻� = " + e.indexOf("¥"));
		System.out.println("���ڿ� �˻� = " + e.indexOf("��¥"));
		System.out.println("���ڿ� �˻� = " + e.indexOf("���ٺ�") );
		
		
		
	}
}