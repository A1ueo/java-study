package homework.homework03.model.dao;

import java.io.File;

public class FileDAO {
	
	public boolean checkName(String file) {
		File f = new File(file);
		return f.exists();
	}
	
	public void fileSave(String file, String s) {}
	
	public StringBuilder fileOpen(String file) {}
	
	public void fileEdit(String file, String s) {}
	

}
