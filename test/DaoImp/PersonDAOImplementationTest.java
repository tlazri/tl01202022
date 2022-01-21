/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import java.util.List;
import model.Person;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tlazr
 */
public class PersonDAOImplementationTest {
    
    public PersonDAOImplementationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class PersonDAOImplementation.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Person person = null;
        PersonDAOImplementation instance = new PersonDAOImplementation();
     //   instance.create(person);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class PersonDAOImplementation.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        PersonDAOImplementation instance = new PersonDAOImplementation();
        Person expResult = null;
        Person result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class PersonDAOImplementation.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        PersonDAOImplementation instance = new PersonDAOImplementation();
        List<Person> expResult = null;
        List<Person> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PersonDAOImplementation.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Person person = null;
        PersonDAOImplementation instance = new PersonDAOImplementation();
        instance.update(person);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PersonDAOImplementation.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        PersonDAOImplementation instance = new PersonDAOImplementation();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
