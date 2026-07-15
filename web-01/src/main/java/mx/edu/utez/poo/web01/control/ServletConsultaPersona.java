package mx.edu.utez.poo.web01.control;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mx.edu.utez.poo.web01.model.Persona;

import java.io.IOException;

@WebServlet (name = "servletConsultaPersona" , value = "/servlet-persona")
public class ServletConsultaPersona extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        Persona unaPersona = new Persona();
        unaPersona.setName("Kristal");
        unaPersona.setEdad(19);
        unaPersona.setApellido("Trinidad");

        req.setAttribute("persona",unaPersona);
        req.getRequestDispatcher("WEB-INF/consulta-persona.jsp").forward(req,resp);


    }


}
