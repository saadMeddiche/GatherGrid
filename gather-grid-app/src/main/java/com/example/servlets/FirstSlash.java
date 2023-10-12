package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.example.helpers.TransactionHelper;

import jakarta.persistence.EntityManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(name = "FirstSlash", urlPatterns = { "/" })
public class FirstSlash extends HttpServlet {

    {
        EntityManager entityManager = new TransactionHelper().getEntiteManager();
        entityManager.close();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Home Page");

    }
}
