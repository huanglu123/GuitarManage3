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

	// ��Ӽ�������
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

	// ��ѯ��������
	public List<Guitar> searchGuitar() {
		return guitars;
	}

	// ɾ����������
	public void delGuitar(String serialNumber) {

	}

}