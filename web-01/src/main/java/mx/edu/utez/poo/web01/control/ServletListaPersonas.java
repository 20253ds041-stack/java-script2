package mx.edu.utez.poo.web01.control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mx.edu.utez.poo.web01.model.Persona;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet (name = "servletListaPersonas",value = "/servlet-lista-personas")
public class ServletListaPersonas extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        List<Persona> listaPersonas = new ArrayList<>();

        Persona persona1= new Persona();
        persona1.setName("Kristal");
        persona1.setEdad(20);
        persona1.setApellido("Trinidad");
        listaPersonas.add(persona1);

        Persona persona2= new Persona();
        persona2.setName("Allisson");
        persona2.setEdad(19);
        persona2.setApellido("Dominguez");
        listaPersonas.add(persona2);

        Persona persona3= new Persona();
        persona3.setName("Samantha");
        persona3.setEdad(18);
        persona3.setApellido("Terrones");
        listaPersonas.add(persona3);

        req.setAttribute("listaPersonas",listaPersonas);
        req.getRequestDispatcher("WEB-INF/consulta-lista-personas.jsp").forward(req,resp);
    }

}
