package web.example;

import web.example.container.HttpServlet;
import web.example.container.Request;
import web.example.container.Response;

import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    @Override
    public void init() {
        System.out.println("HelloWorldServlet init() called..");
    }

    @Override
    public void doGet(Request request, Response response) {
        PrintWriter out = response.getPrintWriter();
        out.println("<html><body>");
        out.println("doGet() in HelloWorldServlet");
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
        System.out.println("clean up resources in HelloWorldServlet destroy()..");
    }
}
