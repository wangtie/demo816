import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;


public class TabFolderDemo {
	private static Table table;
	private static Table table_1;
	private static Table table_2;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mntmFile = new MenuItem(menu, SWT.CASCADE);
		mntmFile.setText("File");
		
		Menu menu_1 = new Menu(mntmFile);
		mntmFile.setMenu(menu_1);
		
		MenuItem mntmNew = new MenuItem(menu_1, SWT.NONE);
		mntmNew.setText("New");
		
		MenuItem mntmOpenFile = new MenuItem(menu_1, SWT.NONE);
		mntmOpenFile.setText("Open File");
		
		MenuItem mntmClose = new MenuItem(menu_1, SWT.NONE);
		mntmClose.setText("Close");
		
		MenuItem mntmEdit = new MenuItem(menu, SWT.CASCADE);
		mntmEdit.setText("Edit");
		
		Menu menu_2 = new Menu(mntmEdit);
		mntmEdit.setMenu(menu_2);
		
		MenuItem mntmSource = new MenuItem(menu, SWT.CASCADE);
		mntmSource.setText("Source");
		
		Menu menu_3 = new Menu(mntmSource);
		mntmSource.setMenu(menu_3);
		
		MenuItem mntmRefactor = new MenuItem(menu, SWT.CASCADE);
		mntmRefactor.setText("Refactor");
		
		Menu menu_4 = new Menu(mntmRefactor);
		mntmRefactor.setMenu(menu_4);
		
		MenuItem mntmNavgiate = new MenuItem(menu, SWT.CASCADE);
		mntmNavgiate.setText("Navgiate");
		
		Menu menu_5 = new Menu(mntmNavgiate);
		mntmNavgiate.setMenu(menu_5);
		
		SashForm sashForm = new SashForm(shell, SWT.NONE);
		
		TabFolder tabFolder = new TabFolder(sashForm, SWT.NONE);
		
		TabItem tabItem_1 = new TabItem(tabFolder, SWT.NONE);
		tabItem_1.setText("\u5BFC\u822A\u5668");
		
		ViewForm viewForm = new ViewForm(tabFolder, SWT.NONE);
		tabItem_1.setControl(viewForm);
		
		TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("\u5BF9\u8C61");
		
		ViewForm viewForm_1 = new ViewForm(tabFolder, SWT.NONE);
		tabItem.setControl(viewForm_1);
		
		Tree tree = new Tree(tabFolder, SWT.BORDER);
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(tabFolder, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("Group");
		
		ViewForm viewForm_2 = new ViewForm(tabFolder, SWT.NONE);
		tbtmNewItem.setControl(viewForm_2);
		
		Tree tree_1 = new Tree(viewForm_2, SWT.BORDER);
		viewForm_2.setContent(tree_1);
		
		TreeItem trtmNewTreeitem = new TreeItem(tree_1, SWT.NONE);
		trtmNewTreeitem.setText("\u6574\u4F53\u89C6\u56FE");
		
		TreeItem trtmNewTreeitem_1 = new TreeItem(trtmNewTreeitem, SWT.NONE);
		trtmNewTreeitem_1.setText("ROOT");
		
		TreeItem treeItem_1 = new TreeItem(trtmNewTreeitem_1, SWT.NONE);
		treeItem_1.setText("1111");
		
		TreeItem treeItem_2 = new TreeItem(treeItem_1, SWT.NONE);
		treeItem_2.setText("123");
		
		TreeItem trtmAsd = new TreeItem(treeItem_1, SWT.NONE);
		trtmAsd.setText("asd");
		treeItem_1.setExpanded(true);
		
		TreeItem trtmTest = new TreeItem(trtmNewTreeitem_1, SWT.NONE);
		trtmTest.setText("test");
		
		TreeItem trtmTest_1 = new TreeItem(trtmNewTreeitem_1, SWT.NONE);
		trtmTest_1.setText("test1");
		
		TreeItem trtmDandan = new TreeItem(trtmNewTreeitem_1, SWT.NONE);
		trtmDandan.setText("dandan");
		
		TreeItem trtmTestgroup = new TreeItem(trtmNewTreeitem_1, SWT.NONE);
		trtmTestgroup.setText("testgroup");
		trtmNewTreeitem_1.setExpanded(true);
		
		TreeItem treeItem = new TreeItem(trtmNewTreeitem, SWT.NONE);
		treeItem.setText("\u8BBE\u5907");
		trtmNewTreeitem.setExpanded(true);
		
		SashForm sashForm_2 = new SashForm(sashForm, SWT.VERTICAL);
		
		TabFolder tabFolder_1 = new TabFolder(sashForm_2, SWT.NONE);
		
		TabItem tabItem_2 = new TabItem(tabFolder_1, SWT.NONE);
		tabItem_2.setText("\u53D8\u66F4");
		
		ViewForm viewForm_3 = new ViewForm(tabFolder_1, SWT.NONE);
		tabItem_2.setControl(viewForm_3);
		
		table_1 = new Table(viewForm_3, SWT.BORDER | SWT.FULL_SELECTION);
		viewForm_3.setContent(table_1);
		table_1.setHeaderVisible(true);
		table_1.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(table_1, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("\u72B6\u6001");
		
		TableColumn tableColumn_2 = new TableColumn(table_1, SWT.NONE);
		tableColumn_2.setWidth(100);
		tableColumn_2.setText("\u540D\u79F0");
		
		TableColumn tableColumn_3 = new TableColumn(table_1, SWT.NONE);
		tableColumn_3.setWidth(100);
		tableColumn_3.setText("\u63CF\u8FF0");
		
		TableColumn tableColumn_4 = new TableColumn(table_1, SWT.NONE);
		tableColumn_4.setWidth(100);
		tableColumn_4.setText("\u6700\u540E\u66F4\u65B0");
		
		TableItem tableItem_2 = new TableItem(table_1, SWT.NONE);
		tableItem_2.setText(new String[] {"a", "g", "g", "g"});
		
		TabItem tbtmEccmoniter = new TabItem(tabFolder_1, SWT.NONE);
		tbtmEccmoniter.setText("EccMoniter");
		
		ViewForm viewForm_4 = new ViewForm(tabFolder_1, SWT.NONE);
		tbtmEccmoniter.setControl(viewForm_4);
		
		table_2 = new Table(viewForm_4, SWT.BORDER | SWT.FULL_SELECTION);
		table_2.setLinesVisible(true);
		table_2.setHeaderVisible(true);
		viewForm_4.setContent(table_2);
		
		TableColumn tableColumn_5 = new TableColumn(table_2, SWT.NONE);
		tableColumn_5.setWidth(100);
		tableColumn_5.setText("\u72B6\u6001");
		
		TableColumn tableColumn_6 = new TableColumn(table_2, SWT.NONE);
		tableColumn_6.setWidth(100);
		tableColumn_6.setText("\u540D\u79F0");
		
		TableColumn tableColumn_7 = new TableColumn(table_2, SWT.NONE);
		tableColumn_7.setWidth(100);
		tableColumn_7.setText("\u63CF\u8FF0");
		
		TableColumn tableColumn_8 = new TableColumn(table_2, SWT.NONE);
		tableColumn_8.setWidth(100);
		tableColumn_8.setText("\u66F4\u65B0\u65F6\u95F4");
		
		TabFolder tabFolder_2 = new TabFolder(sashForm_2, SWT.NONE);
		
		TabItem tabItem_5 = new TabItem(tabFolder_2, SWT.NONE);
		tabItem_5.setText("\u6982\u8981");
		
		ViewForm viewForm_7 = new ViewForm(tabFolder_2, SWT.NONE);
		tabItem_5.setControl(viewForm_7);
		
		TabItem tabItem_4 = new TabItem(tabFolder_2, SWT.NONE);
		tabItem_4.setText("\u76F8\u5173\u76D1\u6D4B\u5668");
		
		ViewForm viewForm_5 = new ViewForm(tabFolder_2, SWT.NONE);
		tabItem_4.setControl(viewForm_5);
		
		TabItem tabItem_6 = new TabItem(tabFolder_2, SWT.NONE);
		tabItem_6.setText("\u65E5\u5FD7\u6570\u636E");
		
		ViewForm viewForm_8 = new ViewForm(tabFolder_2, SWT.NONE);
		tabItem_6.setControl(viewForm_8);
		
		table = new Table(sashForm_2, SWT.BORDER | SWT.FULL_SELECTION);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tableColumn = new TableColumn(table, SWT.NONE);
		tableColumn.setWidth(250);
		tableColumn.setText("\u8FD4\u56DE\u503C");
		
		TableColumn tableColumn_1 = new TableColumn(table, SWT.NONE);
		tableColumn_1.setWidth(250);
		tableColumn_1.setText("\u6700\u5927\u503C");
		
		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] {"\u5165\u53E3\u6D41\u91CF", "41545"});
		
		TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		tableItem_1.setText(new String[] {"\u51FA\u53E3\u6D41\u91CF", "154115"});
		sashForm_2.setWeights(new int[] {1, 1, 1});
		sashForm.setWeights(new int[] {1, 3});
		shell.open();
		while(!display.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		display.dispose();
	}
}
