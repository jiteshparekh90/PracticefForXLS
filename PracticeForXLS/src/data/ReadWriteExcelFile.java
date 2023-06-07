package data;

public class ReadWriteExcelFile {

	public static void main(String[] args) {


		Xls_Reader d = new Xls_Reader("C:\\QA\\Testing\\NikulTest.xlsx");
		
		System.out.println(d.getCellData("Data1", "Name", 4));
		System.out.println(d.getCellData("Data1", "Password", 2));
		System.out.println(d.getCellData("Data1", "Email Error", 2));
		
		String correctEmail = d.getCellData("Data1", 1, 4);
		System.out.println(correctEmail);
		
		String browser = d.getCellData("Data1", "Browser", 3);
		System.out.println(browser);
		
		System.out.println(d.getColumnCount("Data1"));
		System.out.println(d.getRowCount("Data1")); 
		
		d.setCellData("Data1", "Name", 9, "Parekh");
		System.out.println(d.getCellData("Data1", "Name", 9));
		
		d.addColumn("Data1", "Devanshi");

	}

}
