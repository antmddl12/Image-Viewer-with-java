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

// ������ �����ϴ� Ŭ����
// JFrame ����Ͽ���.
public class ImageViewerFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ������ â ���� �������� �ؽ�Ʈ
	JLabel label;
	JLabel leftLabel;
	// ���� Ž���� Ŭ���� �Դϴ�.
	// ���� ����, ���� ��������, ���� ���� ���� ��� ����
	JFileChooser chooser;
	// �޴��� �߰��� �� �ִ� �޴���. ���⿡ JMenu�� add�Ѵ�.
	JMenuBar menubar;
	// �޴��ٿ� �߰��Ǵ� �޴���. File, Option, Help...... ���� ���Ѵ�.
	JMenu menuFile;
	// �޴� ������ �ִ� �����۵��̴�. ���(Action)�� �����ϴ� ��ư�̶�� ��������.
	JMenuItem menuitemOpen;
	// PC�� ũ��(pixel����)�� ���ϱ� ���� ����.
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	// PC�� ���̿� ����.
	int screenHeight = screenSize.height;
	int screenWidth = screenSize.width;

	public ImageViewerFrame() {
		// ó�� ���α׷� ����� PC�� ��ũ���� ������ ������� ����ǵ��� �ߴ�.
		setSize(screenWidth, screenHeight);
		
		// label�� �̹����� �����Ͽ� ������ ���� ���ϴ�.
		// ���𰡸� ���ϴ� ��ġ�� ��ġ�ϰ� �ʹٸ� "SwingConstants" interface�� ����� ��.
		// �̹����� ���� �ϴܿ� ��ġ�߽��ϴ�.
		label = new JLabel();
		add(label);
		label.setVerticalAlignment(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		
		/*
		// ���� ���� â�� ������ ���� ���� ���� �� �����غ�.
		leftLabel = new JLabel();
		add(leftLabel);
		leftLabel.setVerticalAlignment(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		 */

		chooser = new JFileChooser();
		// ���� ��� ��� ����
		chooser.setCurrentDirectory(new File("."));

		// �޴��� ����. ���� �޴��ٰ� ������ϴ�.
		// �޴��� �߰��� �� �ֽ��ϴ�.
		menubar = new JMenuBar();
		setJMenuBar(menubar);

		// �޴��� �޴��ٿ� �߰��߽��ϴ�.
		// ���� �޴� ������ �����۵��� �߰��� �� �ְ�, �ٸ� �޴����� �޴��ٿ� �߰��� �� �ֽ��ϴ�.
		menuFile = new JMenu("File");
		menubar.add(menuFile);

		// ���� open�ϴ� ��� �����ϴ� ��ư�Դϴ�.
		menuitemOpen = new JMenuItem("Open");
		menuFile.add(menuitemOpen);
		
		// Open �޴� ��ư Ŭ���� �����ϴ� �̺�Ʈ
		menuitemOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// ������ ���� ���� â ��Ÿ��.
				int result = chooser.showOpenDialog(null);
				
				// â�� �ִ� "����" ��ư�� ���� ���
				if (result == JFileChooser.APPROVE_OPTION) {
					String name = chooser.getSelectedFile().getPath();
					label.setIcon(new ImageIcon(name));
				}
			}
		});
	}
}