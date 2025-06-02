package homework.homework02.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import homework.homework02.model.vo.Lottery;

public class LotteryController {
	private Set<Lottery> lottery = new HashSet<Lottery>();
	private Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		if(win.contains(l)) {
			boolean result = win.remove(l);
			winObject();
			return lottery.remove(l) && result;
		}
		return lottery.remove(l);
	}
	
	public Set<Lottery> searchObject() {
		return lottery;
	}
	
	public Set<Lottery> winObject() {
		final int WINNER = 4;
		
		if(lottery.size() < WINNER)
			return null;
		
		List<Lottery> list = new ArrayList<Lottery>(lottery);
		while(win.size() < WINNER) {
			int rand = (int) (Math.random() * WINNER);
			if(!win.contains(list.get(rand)))
				win.add(list.get(rand));
		}
		return win;
	}
	
	public Set<Lottery> sortedWinObject() {
		List<Lottery> list = new ArrayList<Lottery>(win);
		Collections.sort(list);
		Set<Lottery> linkedSet = new LinkedHashSet<Lottery>(list);
		return linkedSet;
	}
	
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}

}
