package homework.homework03.controller;

import homework.homework03.model.dao.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	public void fileSave(String file, StringBuilder sb) throws Exception {
		fd.fileSave(file, sb.toString());
	}
	
	public StringBuilder fileOpen(String file) throws Exception {
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, StringBuilder sb) throws Exception {
		fd.fileEdit(file, sb.toString());
	}

}
