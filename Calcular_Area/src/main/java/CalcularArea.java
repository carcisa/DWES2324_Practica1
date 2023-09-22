/*Diseña un programa que pida al usuario la base y la altura de un rectángulo. 
 * Luego, calcula y muestra el área del mismo.*/


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CalcularArea
 */
public class CalcularArea extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcularArea() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Double base = Double.parseDouble(request.getParameter("base"));
        Double altura = Double.parseDouble(request.getParameter("altura"));
        double area = base * altura;

        out.print("<h1>METODO GET</h1>");
        out.print("Resultado: " + area);
        out.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Double base = Double.parseDouble(request.getParameter("base"));
        Double altura = Double.parseDouble(request.getParameter("altura"));
        double area = base * altura;

        out.print("<h1>METODO POST</h1>");
        out.print("Resultado: " + area);
        out.close();
    }

}
