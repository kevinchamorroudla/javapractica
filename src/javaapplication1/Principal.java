package javaapplication1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Principal {

    public static void main(String[] args) {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        
        try (FileReader reader = new FileReader("archivos/generated.json"))
        {
            //Se lee el archivo Json
            Object obj = jsonParser.parse(reader);
 
            JSONArray employeeList = (JSONArray) obj;
            //System.out.println(employeeList);
             
            //Iterar sobre la matriz Employee
            employeeList.forEach( emp -> parseGenerateObject( (JSONObject) emp ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    private static void parseGenerateObject(JSONObject employee)
    {
        System.out.println("*****************************/");
        
        String id = (String) employee.get("_id");   
        System.out.println("_id: " + id);
        
        Long index = (Long) employee.get("index");   
        System.out.println("index: " + index);
        
        String guid = (String) employee.get("guid");   
        System.out.println("guid: " + guid);
        
        Boolean isActive = (Boolean) employee.get("isActive");   
        System.out.println("isActive: " + isActive);
        
        String balance = (String) employee.get("balance");   
        System.out.println("balance: " + balance);
        
        String picture = (String) employee.get("picture");   
        System.out.println("picture: " + picture);
        
        Long age = (Long) employee.get("age");   
        System.out.println("age: " + age);
        
        JSONArray tags = (JSONArray) employee.get("tags");   
        System.out.println("tags: " + tags.toString());
    }
    
    private static void parseEmployeeObject(JSONObject employee)
    {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("employee");
         
        //Get employee first name
        String firstName = (String) employeeObject.get("firstName");   
        System.out.println(firstName);
         
        //Get employee last name
        String lastName = (String) employeeObject.get("lastName"); 
        System.out.println(lastName);
         
        //Get employee website name
        String website = (String) employeeObject.get("website");   
        System.out.println(website);
    }
}
