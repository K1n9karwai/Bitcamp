package instance;

/*
[����4] �̸�(name) ȫ�浿�̰� ��������(kor) 90 ��������(eng) 85 ��������(math) 100�� �϶� ����(tot)�� ���(avg)�� ���Ͻÿ�
�� ����� �Ҽ����� 2°�ڸ����� ǥ���Ͻÿ�

[������]
�̸�	����	����	����	����	���
ȫ�浿	90	85	100	xxx	xx.xx
 */

public class Practice4 {
	public static void main(String[] args) {
		String name = "ȫ�浿";
		int kor = 90;
		int eng = 85;
		int math = 100;
		int tot = kor + eng + math;
		double avg = (double) tot / 3;
		//double avg = tot/3.0; �� ����

		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out
				.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + String.format("%.2f", avg));
	}

}