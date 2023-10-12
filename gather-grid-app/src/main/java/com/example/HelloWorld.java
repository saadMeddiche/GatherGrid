package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

@WebServlet(name = "HelloWorld", urlPatterns = { "/hello" })
public class HelloWorld extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Hello World!!!!!!");

    }

    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .buildSessionFactory();
        System.out.println("Hello World!!!!!!");
        System.out.println("Test 1" + factory.toString());
        System.out.println("Test 2" + factory.isClosed());
        factory.close();
        System.out.println("Test 3" + factory.isClosed());
    }
}
