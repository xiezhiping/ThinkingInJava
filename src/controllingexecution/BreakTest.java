package controllingexecution;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i < 10; i++) {
			System.out.println("���ǵ�һ��forѭ��,i��ֵΪ��" + i);
			for (int j = 0; j < 10; j++) {
				System.out.println("���ǵڶ���forѭ��,j ��ֵΪ��" + j);
				break; // ������ǰѭ��
			}
			System.out.println("����break֮���������");
		}
	}

}
