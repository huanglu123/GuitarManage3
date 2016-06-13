package beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import beans.Guitar;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new ArrayList<Guitar>();
	}

	// 添加吉他方法
	public void addGuitar(Guitar guitar) {
		guitars.add(guitar);
	}

	public List search(GuitarSpec searchspec) {
		List matchingGuitars = new LinkedList();
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			System.out.println(guitar.getSpec().getType());
			System.out.println(searchspec.getType());
			if (guitar.getSpec().matches(searchspec))
				matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}

	// 查询吉他方法
	public List<Guitar> searchGuitar() {
		return guitars;
	}

	// 删除吉他方法
	public void delGuitar(String serialNumber) {

	}

}