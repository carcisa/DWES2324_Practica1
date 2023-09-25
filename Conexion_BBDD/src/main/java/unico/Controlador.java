package unico;



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccesoBaseDatos accesoBaseDatos;

    /**
     * Default constructor. 
     */
    public Controlador() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
        super.init();
      
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Lista de nombres a mostrar
       // List<String> nombres = Arrays.asList("Juan", "Ana", "Pedro", "María");
		accesoBaseDatos = new AccesoBaseDatos();
		List<String> nombres =  accesoBaseDatos.devolverNombres();
        // Establecer el tipo de contenido a HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Escribir la lista de nombres en el cuerpo de la respuesta
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Listado de Nombres</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Listado de Nombres</h1>");
        out.println("<ul>");
        for (String nombre : nombres) {
            out.println("<li>" + nombre + "</li>");
        }
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
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