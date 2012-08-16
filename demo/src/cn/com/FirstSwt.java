package cn.com;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.custom.CBanner;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class FirstSwt {
	private static Text text;
	private static Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label label = new Label(shell, SWT.NONE);
		label.setBounds(34, 71, 54, 12);
		label.setText("\u7528\u6237\u540D\uFF1A");
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setBounds(34, 110, 54, 12);
		label_1.setText("\u5BC6  \u7801\uFF1A");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(94, 68, 129, 18);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(94, 110, 129, 18);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(34, 161, 72, 22);
		btnNewButton.setText("\u786E\u8BA4");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_1.setBounds(151, 161, 72, 22);
		btnNewButton_1.setText("\u53D6\u6D88");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
