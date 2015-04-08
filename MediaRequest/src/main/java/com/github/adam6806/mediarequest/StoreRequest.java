/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adam6806.mediarequest;

import com.github.adam6806.mediarequest.emailservice.EmailService;
import java.io.IOException;
import java.sql.Connection;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.sql.DataSource;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import static org.jooq.impl.DSL.*;
import static com.github.adam6806.mediarequest.jooqgenerator.Tables.*;
import com.github.adam6806.mediarequest.jooqgenerator.tables.records.RequestRecord;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;
import org.jooq.InsertSetMoreStep;
import org.jooq.InsertSetStep;
import org.jooq.impl.DSL;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author adam
 */
@WebServlet(asyncSupported = false, name = "StoreRequest", urlPatterns = {"/StoreRequest"})
public class StoreRequest extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private Connection connection = null;

    @Resource(lookup = "java:/MediaRequestDS")
    private DataSource datasource;

    @EJB
    private EmailService emailService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        HttpSession session = request.getSession(false);
        if (session != null) {

        } else {
            try {
                response.setContentType("text/html");
                PrintWriter pw = response.getWriter();

                response.sendRedirect("http://pirateofdw.gotdns.com/Login");

                pw.close();
            } catch (IOException ex) {
                Logger.getLogger(StoreRequest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            connection = datasource.getConnection();
            if (request.getParameter("request").equalsIgnoreCase("data-request")) {

                response.getWriter().write(getResultJSON(connection));
            } else {
                String name = request.getParameter("medianame");
                DSLContext create = DSL.using(connection, SQLDialect.POSTGRES);
                InsertSetMoreStep<RequestRecord> set = create.insertInto(REQUEST)
                        .set(REQUEST.DESCRIPTION, name)
                        .set(REQUEST.MEDIAID, name)
                        .set(REQUEST.POSTERIMAGEURL, name)
                        .set(REQUEST.REQUESTDATE, name)
                        .set(REQUEST.EMAIL, name)
                        .set(REQUEST.ISMOVIE, true);
                set.execute();
                response.getWriter().write(getResultJSON(connection));
                emailService.sendMail("asmith0935@gmail.com", name, name);
            }
            response.setStatus(200);
        } catch (SQLException | IOException ex) {
            Logger.getLogger(StoreRequest.class.getName()).log(Level.SEVERE, null, ex);
            response.setStatus(500);
        }

    }

    private String getResultJSON(Connection connection) {
        String output = "";
        try {
            DSLContext create = DSL.using(connection, SQLDialect.POSTGRES);
            Result<RequestRecord> result = create.fetch(REQUEST);

            JSONArray jSONArray = new JSONArray();
            for (Record r : result) {
                JSONObject requestJSON = new JSONObject();
                //String description = r.getValue(REQUEST.DESCRIPTION);
                String email = r.getValue(REQUEST.EMAIL);
                //boolean isMovie = r.getValue(REQUEST.ISMOVIE);
                //String mediaId = r.getValue(REQUEST.MEDIAID);
                //String imageUrl = r.getValue(REQUEST.POSTERIMAGEURL);
                String requestDate = r.getValue(REQUEST.REQUESTDATE);
                //requestJSON.put("description", description);
                //requestJSON.put("email", email);
                //requestJSON.put("isMovie", isMovie);
                //requestJSON.put("mediaId", mediaId);
                //requestJSON.put("imageUrl", imageUrl);
                //requestJSON.put("requestDate", requestDate);
                jSONArray.put(email);
            }
            output = jSONArray.toString();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(StoreRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }
}
