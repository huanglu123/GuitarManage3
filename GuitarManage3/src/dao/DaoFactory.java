package dao;

import mysqlDao.MySqlGuitarDaoImpl;
import sqliteDao.SqliteGuitarDaoImpl;


public class DaoFactory
{

	 //private static String db="sqlite";
	private static String db = "mysql";

	public static IGuitarDao createGuitarDao()
	{
		IGuitarDao result = null;
		switch (db)
		{
		case "sqlite":
			result = new SqliteGuitarDaoImpl();
			break;
		case "mysql":
			result = new MySqlGuitarDaoImpl();
			break;
		}
		return result;

	}

}