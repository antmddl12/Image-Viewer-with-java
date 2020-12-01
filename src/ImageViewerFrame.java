import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

// 프레임 정의하는 클래스
// JFrame 사용하였다.
public class ImageViewerFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 프레임 창 내에 보여지는 텍스트
	JLabel label;
	JLabel leftLabel;
	// 파일 탐색기 클래스 입니다.
	// 파일 열기, 내용 가져오기, 파일 저장 등의 기능 수행
	JFileChooser chooser;
	// 메뉴를 추가할 수 있는 메뉴바. 여기에 JMenu를 add한다.
	JMenuBar menubar;
	// 메뉴바에 추가되는 메뉴들. File, Option, Help...... 등을 말한다.
	JMenu menuFile;
	// 메뉴 하위에 있는 아이템들이다. 기능(Action)을 수행하는 버튼이라고 생각하자.
	JMenuItem menuitemOpen;
	// PC의 크기(pixel단위)를 구하기 위해 선언.
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	// PC의 높이와 넓이.
	int screenHeight = screenSize.height;
	int screenWidth = screenSize.width;

	public ImageViewerFrame() {
		// 처음 프로그램 실행시 PC의 스크린과 동일한 사이즈로 실행되도록 했다.
		setSize(screenWidth, screenHeight);
		
		// label에 이미지를 설정하여 프레임 내에 띄웁니다.
		// 무언가를 원하는 위치에 배치하고 싶다면 "SwingConstants" interface를 사용할 것.
		// 이미지를 우측 하단에 배치했습니다.
		label = new JLabel();
		add(label);
		label.setVerticalAlignment(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		
		/*
		// 파일 오픈 창을 프레임 내에 띄우기 위해 라벨 선언해봄.
		leftLabel = new JLabel();
		add(leftLabel);
		leftLabel.setVerticalAlignment(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		 */

		chooser = new JFileChooser();
		// 현재 사용 경로 지정
		chooser.setCurrentDirectory(new File("."));

		// 메뉴바 선언. 이제 메뉴바가 생겼습니다.
		// 메뉴를 추가할 수 있습니다.
		menubar = new JMenuBar();
		setJMenuBar(menubar);

		// 메뉴를 메뉴바에 추가했습니다.
		// 이제 메뉴 하위에 아이템들을 추가할 수 있고, 다른 메뉴들을 메뉴바에 추가할 수 있습니다.
		menuFile = new JMenu("File");
		menubar.add(menuFile);

		// 파일 open하는 기능 수행하는 버튼입니다.
		menuitemOpen = new JMenuItem("Open");
		menuFile.add(menuitemOpen);
		
		// Open 메뉴 버튼 클릭시 동작하는 이벤트
		menuitemOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// 파일을 열기 위한 창 나타남.
				int result = chooser.showOpenDialog(null);
				
				// 창에 있는 "열기" 버튼을 누를 경우
				if (result == JFileChooser.APPROVE_OPTION) {
					String name = chooser.getSelectedFile().getPath();
					label.setIcon(new ImageIcon(name));
				}
			}
		});
	}
}