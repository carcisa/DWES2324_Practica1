package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Edad
 */
public class Edad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edad() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("text/html").append(request.getContextPath());
		PrintWriter out = response.getWriter();
        Integer edad = Integer.parseInt(request.getParameter("edad"));
        int etapa = 0;
        if (etapa < 12 ) {
			System.out.println("Infante");
		}else {
			if (etapa >= 12 && etapa <= 17) {
				System.out.println("Adolescente");
			}else {
				if (etapa >= 18 && etapa < 60) {
					System.out.println("Adulto");
				}else {
					if (etapa > 60) {
						System.out.println("Anciano");
					}
		}
        out.print("<h1>METODO GET</h1>");
        out.print("Etapa: " + etapa);
        out.close();
			}
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
        Integer edad = Integer.parseInt(request.getParameter("edad"));
        int etapa = 0;
        if (etapa < 12 ) {
			System.out.println("Infante");
		}else {
			if (etapa >= 12 && etapa <= 17) {
				System.out.println("Adolescente");
			}else {
				if (etapa >= 18 && etapa < 60) {
					System.out.println("Adulto");
				}else {
					if (etapa > 60) {
						System.out.println("Anciano");
					}
		}
        out.print("<h1>METODO GET</h1>");
        out.print("Etapa: " + etapa);
        out.close();
			}
	}
	}

}
