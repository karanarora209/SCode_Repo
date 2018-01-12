package com.howtodoinjava.JerseyJSONP;
 
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.awt.List;
import java.util.ArrayList;
import javax.ws.rs.core.GenericEntity;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;



@Path("/employees")
public class JerseyJSONP
{
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Employees getAllEmployees() 
    {
        Employees list = new Employees();
        list.setEmployeeList(new ArrayList<Employee>());
         
        list.getEmployeeList().add(new Employee(1, "Lokesh Gupta"));
        list.getEmployeeList().add(new Employee(2, "Alex Kolenchiskey"));
        list.getEmployeeList().add(new Employee(3, "David Kameron"));
        list.getEmployeeList().add(new Employee(4, "David Kamaninoski"));
        list.getEmployeeList().add(new Employee(5, "Tommy Figureiski"));
        list.getEmployeeList().add(new Employee(6, "Tim Bohiski"));
        list.getEmployeeList().add(new Employee(7, "John Tally"));
        list.getEmployeeList().add(new Employee(7, "John Bernard"));
        list.getEmployeeList().add(new Employee(7, "Timothy Dalton"));
        
        /* Added additional records */
        list.getEmployeeList().add(new Employee(7, "Prasad Mahindrakar"));
        
        /* Added additional records */
        list.getEmployeeList().add(new Employee(7, "Prasad Mahindrakar2"));
        list.getEmployeeList().add(new Employee(7, "Prasad Mahindrakar3"));
         
        return list;
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateEmployeeById(@PathParam("id") Integer id) 
    {
        if(id  < 0){
            return Response.noContent().build();
        }
        Employee emp = new Employee();
         
        emp.setId(id);
        emp.setName("Prasad Mahindrakar"); /* Added By Prasad Mahindrakar - eprmahi */
         
        GenericEntity<Employee> entity = new GenericEntity<Employee>(emp, Employee.class);
        return Response.ok().entity(entity).build();
    }
}   



