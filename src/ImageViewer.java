/*
프로젝트 이름: 	내가 만드는 사진 앨범 프로그램
제작자: 		박 무 승
담당교수:		홍 득 조 교수님
해당과목: 	객체지향프로그래밍 설계
사용언어: 	java
구현기능:		기본기능, 추가기능으로 구분됩니다.
기본기능		
	1. 컴퓨터에 있는 이미지 파일 검색
	2. 앨범에 있는 사진 검색
	3. 앨범(디렉토리) 추가, 삭제
	4. 앨범에 사진 추가(저장), 삭제
	5. 텍스트 입력 (저장 및 사진과 함께 띄우기)
추가기능
	1. 사진 편집 후 저장 기능
		비율 변경 = 1:1, 4:3, 16:9
		사진 회전 = 좌로 90도 회전, 우로 90도 회전, 좌로 180도 회전, 우로 180도 회전
	2. 사진에 필터 입히기 (불가능 이라고 생각)
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
