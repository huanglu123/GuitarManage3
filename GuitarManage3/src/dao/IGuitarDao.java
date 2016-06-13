package dao;

import java.util.List;

import beans.Guitar;
import beans.Inventory;

public interface IGuitarDao {
	public List<Guitar> searchGuitar();

	public Inventory Inventory();

	public void addGuitar(Guitar guitar);

	public void delGuitar(String serialNumber);

}