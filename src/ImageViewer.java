/*
������Ʈ �̸�: 	���� ����� ���� �ٹ� ���α׷�
������: 		�� �� ��
��米��:		ȫ �� �� ������
�ش����: 	��ü�������α׷��� ����
�����: 	java
�������:		�⺻���, �߰�������� ���е˴ϴ�.
�⺻���		
	1. ��ǻ�Ϳ� �ִ� �̹��� ���� �˻�
	2. �ٹ��� �ִ� ���� �˻�
	3. �ٹ�(���丮) �߰�, ����
	4. �ٹ��� ���� �߰�(����), ����
	5. �ؽ�Ʈ �Է� (���� �� ������ �Բ� ����)
�߰����
	1. ���� ���� �� ���� ���
		���� ���� = 1:1, 4:3, 16:9
		���� ȸ�� = �·� 90�� ȸ��, ��� 90�� ȸ��, �·� 180�� ȸ��, ��� 180�� ȸ��
	2. ������ ���� ������ (�Ұ��� �̶�� ����)
*/
import javax.swing.JFrame;


public class ImageViewer {
	public static void main(String args[]) {
		// create Frame
		JFrame frame = new ImageViewerFrame();
		// set name of the Program(=frame)
		frame.setTitle("Image Viewer Application");
		// exit option (right top red box)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// make frame visible
		frame.setVisible(true);
	}
}
