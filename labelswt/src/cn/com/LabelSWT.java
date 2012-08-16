package cn.com;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class LabelSWT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display=new Display();
		Shell shell=new Shell(display);
		shell.setText("标签示例");
		shell.setSize(300, 200);
		Label label1=new Label(shell, SWT.BORDER|SWT.RIGHT);
		label1.setText("label1");
		label1.setBounds(10, 10, 70, 20);
		label1.setFont(new Font(display, "黑体", 14, SWT.BOLD));
		label1.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_BLUE));
		
		Label label2=new Label(shell, SWT.CENTER);
		label2.setText("label2");
		label2.setBounds(10, 50, 70, 20);
		label2.setFont(new Font(display, "宋体", 15, SWT.NULL));
//		shell.pack();
		shell.open();
		while(!display.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		display.dispose();
	}

}
