package homework.homework03.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileDAO {
	
	public boolean checkName(String file) {
		File f = new File(file);
		return f.exists();
	}
	
	public void fileSave(String file, String s) throws Exception {
		File f = new File(file);
		if (!f.exists()) f.createNewFile();
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		bw.write(s);
		bw.flush();
		bw.close();
	}
	
	public StringBuilder fileOpen(String file) throws Exception {
		File f = new File(file);
		if (!f.exists()) {
			System.out.println("없는 파일입니다.");
			return null;
		}
		BufferedReader br = new BufferedReader(new FileReader(f));
		StringBuilder sb = new StringBuilder();
		String str;
		while ((str = br.readLine()) != null) {
			sb.append(str).append('\n');
		}
		br.close();
		
		return sb;
	}
	
	public void fileEdit(String file, String s) throws Exception {
			File f = new File(file);
			if (!f.exists()) {
				System.out.println("없는 파일입니다.");
				return ;
			}
			BufferedReader br = new BufferedReader(new FileReader(f));
			StringBuilder sb = new StringBuilder();
			String str;
			while ((str = br.readLine()) != null) {
				sb.append(str).append('\n');
			}
			br.close();
			
			sb.append(s);
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			bw.write(sb.toString());
			bw.flush();
			bw.close();
		}

}
