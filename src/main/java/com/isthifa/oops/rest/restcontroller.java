package com.isthifa.oops.rest;

import com.isthifa.oops.abstra.Circle;
import com.isthifa.oops.abstra.Rectangle;
import com.isthifa.oops.abstra.Shape;
import com.isthifa.oops.exception.InvalidInputype;
import com.isthifa.oops.interf.employeeD;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class restcontroller {


    //Polymorphism - method overloading  -------- and method overriding--------
    @GetMapping("/add/{id1}/{id2}")
    public int add(@PathVariable int id1, @PathVariable int id2)
    {
        int result =id1+id2;
        return result;
    }
    @GetMapping("/string/{a1}/{a2}")
    public String add(@PathVariable String a1, @PathVariable String a2)
    {
        String a=a1+a2;
        return a;
    }
    //abstract class
    @GetMapping("/shape/{type}")
    public Shape getShape(@PathVariable String type)
    {
        if(type.equals("circle"))
        {
            Circle circle=new Circle();
            circle.setRadius(5.0);
            return circle;
        }
        else if(type.equals("rectangle"))
        {
            Rectangle rectangle=new Rectangle();
            rectangle.setLength(10.0);
            rectangle.setWidth(5.0);
            return rectangle;
        }
        else
        {
            throw new InvalidInputype("invalid input");
        }
    }
    //inheritance example-----------------
    @GetMapping("/inheritance/{etype}")
    public employeeD details(@PathVariable String etype) {
        if (etype.equals("e1")) {
            employeeD employe = new employeeD("test1", 10);
            return employe;
        } else if (etype.equals("e2")) {
            employeeD employe = new employeeD("test2", 20);
            return employe;
        } else {
            throw new InvalidInputype("invalid input");
        }
    }
    //String builder example----------------
    @GetMapping("/stringbuilder/{stype}")
    public String example(@PathVariable String stype)
    {
        StringBuilder sb=new StringBuilder("hello");
        if(stype.equals("add"))
        {
            sb.append("world");
            return sb.toString();
        }
        else if(stype.equals("reverse"))
        {
            return sb.reverse().toString();
        }
        else if(stype.equals("length"))
        {
            return String.valueOf(sb.length());
        }
        else
        {
            throw new InvalidInputype("invalid input");
        }
    }
    //String buffer example--------------------------
    @GetMapping("/stringbuffer/{btype}")
    public String exampleS(@PathVariable String btype)
    {
        StringBuffer sb=new StringBuffer("helloworld");
        if(btype.equals("add"))
        {
            sb.append("hello");
            return sb.toString();
        }
        else if(btype.equals("reverse"))
        {
            return sb.reverse().toString();
        }
        else
        {
            throw new InvalidInputype("Invalid input");
        }
    }
    //loops
    @GetMapping("/loops/{ltype}")
    public List<String> loop(@PathVariable String ltype)
    {
        List<String> list= Arrays.asList("test1","test2","test3","test4");
        List<String> result=new ArrayList<>();
        if(ltype.equals("for")) {
            for (int i = 0; i < list.size(); i++) {
                result.add(list.get(i));
            }
            return list;
        }
        else if(ltype.equals("do"))
        {
            int i=0;
            do {
                result.add(list.get(i));
                i++;
            }
            while (i<list.size());
            return result;
        }
        else if(ltype.equals("while"))
        {
            int i=0;
            while(i<list.size())
            {
                result.add(list.get(i));
                i++;
            }
            return result;
        }
        else if(ltype.equals("foreach"))
        {
            for(String c:list)
            {
                result.add(c);
            }
            return result;
        }
        else
        {
            throw new InvalidInputype("Invalid input");
        }
    }


}
