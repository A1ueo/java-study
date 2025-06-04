package homework.homework03.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import homework.homework03.model.vo.Member;


public class MemberController {
	Map<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMember(String id, Member m) {
		if(map.containsKey(id)) return false;
		else {
			map.put(id, m);
			return true;
		}
	}
	
	public String logIn(String id, String password) {
		if(map.containsKey(id)) {
			Member member = map.get(id);
			if(member.getPassword().equals(password))
				return member.getName();
		}
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if (map.containsKey(id)) {
			Member member = map.get(id);
			if(member.getPassword().equals(oldPw)) {
				member.setPassword(newPw);
				return true;
			}
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}
	
	public TreeMap<String, String> sameName(String name) {
		TreeMap<String, String> newMap = new TreeMap<String, String>();
		for(String id : map.keySet()) {
			if(map.get(id).getName().equals(name)) {
				newMap.put(id, name);
			}
		}
			
		return newMap;
	}
	
}
