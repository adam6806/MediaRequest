/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adam6806.mediarequest.couchpotatoservice;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.http.client.utils.URIBuilder;

/**
 *
 * @author adam
 */
@WebServlet(name = "CouchPotatoService", urlPatterns = {"index.html"})
public class CouchPotatoService extends HttpServlet {

    @Resource(lookup = "java:global/couchPotatoURL")
    private URL couchPotatoURL;

    @Resource(lookup = "java:global/couchPotatoApiKey")
    private String apiKey;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        try {
            HttpClient httpClient = new HttpClient();
            String term = request.getParameter("searchTerm");
            URI uri = new URIBuilder()
                    .setScheme(couchPotatoURL.getProtocol())
                    .setHost(couchPotatoURL.getHost())
                    .setPort(couchPotatoURL.getPort())
                    .setPath("/api/" + apiKey + "/movie.search")
                    .setParameter("q", term)
                    .build();
            GetMethod getMethod = new GetMethod(uri.toString());
            getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
                    new DefaultHttpMethodRetryHandler(3, false));
            httpClient.executeMethod(getMethod);
            String responseBody = getMethod.getResponseBodyAsString();
            response.getWriter().write(responseBody);
        } catch (URISyntaxException ex) {
            Logger.getLogger(CouchPotatoService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CouchPotatoService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
