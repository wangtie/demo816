import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;


public class MyPageOne extends WizardPage{
	private Text text1;
	
	private Composite container;
	
	public MyPageOne(){
		super("First Page");
		setTitle("First Page One");
		setDescription("This wizard does not really do anything. But this is the first page");
	}
	
	@Override
	public void createControl(Composite parent) {
		container =new Composite(parent, SWT.NULL);
		GridLayout glayout=new GridLayout();
		container.setLayout(glayout);
		glayout.numColumns=2;
		Label label1=new Label(container, SWT.NULL);
		label1.setText("Put Here A Value");
		text1 = new Text(container, SWT.BORDER);
		text1.setText("");
		text1.addKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(!text1.getText().isEmpty()){
					setPageComplete(true);
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				
			}
		});
		GridData data=new GridData(GridData.FILL_HORIZONTAL);
		text1.setLayoutData(data);
		setControl(container);
		setPageComplete(false);
	}

	public String getText1() {
		return text1.getText();
	}

}
