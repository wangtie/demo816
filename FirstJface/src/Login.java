
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;


public class Login {
	private static Text text1;
	private static Text text2;
	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
		
		Label label1 = new Label(shell, SWT.NONE);
		label1.setBounds(115, 78, 54, 12);
		label1.setText("\u7528\u6237\u540D\uFF1A");
		
		Label label2 = new Label(shell, SWT.NONE);
		label2.setBounds(115, 123, 54, 12);
		label2.setText("\u5BC6  \u7801\uFF1A");
		
		text1 = new Text(shell, SWT.BORDER);
		text1.setBounds(175, 78, 157, 18);
		
		text2 = new Text(shell, SWT.BORDER);
		text2.setBounds(175, 123, 157, 18);
		
		Button but1 = new Button(shell, SWT.NONE);
		but1.setBounds(115, 169, 72, 22);
		but1.setText("\u786E  \u5B9A");
		
		Button but2 = new Button(shell, SWT.NONE);
		but2.setBounds(260, 169, 72, 22);
		but2.setText("\u53D6  \u6D88");
		
		shell.open();
//		shell.pack();
		while(!display.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		display.dispose();
	}
}
