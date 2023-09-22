package unico;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ElMayor
 */
public class ElMayor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ElMayor() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("text/html").append(request.getContextPath());
		PrintWriter out = response.getWriter();
        Integer num1 = Integer.parseInt(request.getParameter("numero 1"));
        Integer num2 = Integer.parseInt(request.getParameter("numero 2"));
        Integer num3 = Integer.parseInt(request.getParameter("numero 3"));
        int resultado;
        if (num1 > num2 && num1 > num3) {
			resultado = num1;
		}else {
			if (num2 > num3) {
				resultado = num2;
			}else {
				resultado = num3;
			}
		}
        out.print("<h1>METODO GET</h1>");
        out.print("Resultado: " + resultado);
        out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
