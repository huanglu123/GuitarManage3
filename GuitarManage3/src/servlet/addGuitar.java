package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Guitar;
import beans.GuitarSpec;
import dao.DaoFactory;
import dao.IGuitarDao;

/**
 * Servlet implementation class addGuitar
 */
@WebServlet("/addGuitar")
public class addGuitar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addGuitar() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		System.out.println("tiaozhuan");
		
		String serialNumber = request.getParameter("serialNumber");
		Double price = Double.parseDouble(request.getParameter("price"));
		String builder = request.getParameter("builder");
		String model = request.getParameter("model");
		String type = request.getParameter("type");
		String backWood = request.getParameter("backWood");
		String topWood = request.getParameter("topWood");

		
		IGuitarDao guitardao = DaoFactory.createGuitarDao();
		Guitar guitar = new Guitar();
		GuitarSpec guitarspec = new GuitarSpec();
		guitar.setSerialNumber(serialNumber);
		guitar.setPrice(price);
		guitarspec.setBuilder(builder);
		guitarspec.setModel(model);
		guitarspec.setType(type);
		guitarspec.setBackWood(backWood);
		guitarspec.setTopWood(topWood);
		guitar.setSpec(guitarspec);

		guitardao.addGuitar(guitar);
		System.out.println("Ìí¼Ó³É¹¦");

	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}	
}
