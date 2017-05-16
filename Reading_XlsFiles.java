package Config;

public class Reading_XlsFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Xls_Reader xls = new Xls_Reader("C://Users//jo//Documents//TestData.xlsx");
		 int rc = xls.getRowCount("student");
		//xls.getRowCount("student);
		System.out.println(rc);
		
		/*xls. getCellData("student", "name", 2);
		
		System.out.println(name);*/
	}

	
	}


