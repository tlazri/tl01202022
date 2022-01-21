/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import DaoImp.PersonDAOImplementation;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Person;

/**
 *
 * @author User
 */
@WebServlet("/student")
public class StudentController extends HttpServlet {

    PersonDAOImplementation dao;

    @Override
    public void init() {
        dao = new PersonDAOImplementation();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
///
        int id = Integer.parseInt(request.getParameter("x"));
        String action = request.getParameter("act");
        //PersonDAOImplementation dao = new PersonDAOImplementation();
     if(action.equals("delete")){
        dao.delete(id);

        List<Person> listPersons = dao.findAll();

        String city = "Montreal";

        request.setAttribute("x", listPersons);  // x is attiribute that holds the list of persons from DAO

        getServletContext().getRequestDispatcher("/personList.jsp").forward(request, response);
    }}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        int id = Integer.parseInt(request.getParameter("id1"));
        String name = request.getParameter("name1");

        //  PersonDAOImplementation dao = new PersonDAOImplementation();
        Person person = new Person();

        person.setId(id);
        person.setName(name);
        dao.create(person);

        List<Person> listPersons = dao.findAll();

        String city = "Montreal";
        
        HttpSession session = request.getSession();
        
        String sessionId = session.getId();
        
        request.setAttribute("sessionId", sessionId);
        
        
        System.out.println("Session id" + session.getId());
       // request.setAttribute("sessionId", session);
        request.setAttribute("x", listPersons);  // x is attiribute that holds the list of persons from DAO

        request.setAttribute("person1", person);
        request.setAttribute("city", city);
        
        session.setAttribute("y", listPersons);
        /*
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/welcome");
        dispatcher.forward(request, response); */
//      getServletContext().getRequestDispatcher("/welcome.jsp").forward(request,response);
        // getServletContext().getRequestDispatcher("/person.jsp").forward(request, response);
        getServletContext().getRequestDispatcher("/personList.jsp").forward(request, response);

    }

}
