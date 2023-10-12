package com.example.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.example.helpers.TransactionHelper;

import jakarta.persistence.PersistenceContext;

import jakarta.persistence.EntityManager;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloWorld", urlPatterns = { "/hello" })
public class HelloWorld extends HttpServlet {

    // @PersistenceContext
    // EntityManager em;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Hello WorldPPPP");

    }

}
