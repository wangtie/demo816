import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


public class HelloSWT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
		shell.setLayout(null);
		Text hello = new Text(shell, SWT.MULTI);
		shell.setText("SWT世界");
		shell.setSize(300, 200);
		Color color = new Color(display.getCurrent(), 255,255,255);
		shell.setBackground(color);
		hello.setText("Hello World!\n\n你好，世界！");
		hello.pack();
//		shell.pack();
		shell.open();
		while(!shell.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		display.dispose();
	}

}
