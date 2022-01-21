/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.projectmethods;

import DaoImp.PersonDAOImplementation;
import interfaceDao.PersonDao;
import java.util.List;
import java.util.Scanner;
import model.Person;

/**
 *
 * @author User
 */
public class MyProjectMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    
        PersonDao dao = new PersonDAOImplementation();
          List<Person> listPersons = dao.findAll();
   for ( Person p:listPersons)
   {
       System.out.println("name"  +p.getName());
   }
}}

 