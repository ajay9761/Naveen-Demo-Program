package DataDriven;

public interface Xls_Reader {

	String getCellData(String string, String string2, int i);

	void setCellData(String string, String string2, int rowNum, String string3);

	void addColumn(String string, String string2);

	int getRowCount(String string);

}
