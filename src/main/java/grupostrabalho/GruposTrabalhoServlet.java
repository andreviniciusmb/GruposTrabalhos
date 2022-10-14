/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package grupostrabalho;

import atuacao.Atuacao;
import atuacao.AtuacaoBeanLocal;
import endereco.Endereco;
import endereco.EnderecoBeanLocal;
import grupo.Grupo;
import grupo.GrupoBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pessoa.Pessoa;
import pessoa.PessoaBeanLocal;
import util.Util;

/**
 *
 * @author andre-barros
 */
@WebServlet(name = "Relatorios", urlPatterns = {"/Relatorios"})
public class GruposTrabalhoServlet extends HttpServlet {

    @Inject
    PessoaBeanLocal pessoaBean;
    
    @Inject
    EnderecoBeanLocal enderecoBean;
    
    @Inject
    GrupoBeanLocal grupoBean;
    
    @Inject
    AtuacaoBeanLocal atuacaoBean;        
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
                    
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Desenvolvimento Web</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Estudo Dirigido: Jakarta Persistence Query Language</h1>");
            out.println("<h2>Consulta 1.A: Quais as pessoas (dados completos) cadastradas? Por meio de Query</h2>");
            //List<Pessoa> lst_pessoas_query = pessoaBean.findAllPessoasQuery();
            //out.println("<p><pre>" + Util.toJson(lst_pessoas_query) + "</pre></p>");
            out.println("<h2>Consulta 1.B: Quais as pessoas (dados completos) cadastradas? Por meio de TypedQuery</h2>");
            List<Pessoa> lst_pessoas_typed_query = pessoaBean.findAllPessoasTypedQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_typed_query) + "</pre></p>");
            out.println("<h2>Consulta 1.C: Quais as pessoas (dados completos) cadastradas? Por meio de NameedQuery</h2>");
            List<Pessoa> lst_pessoas_named_query = pessoaBean.findAllPessoasNamedQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_named_query) + "</pre></p>");
            
            out.println("<h2>Consulta 2.A: Quais os nomes das pessoas? Por meio de Query</h2>");
            List<Pessoa> lst_pessoas_query = pessoaBean.findAllPessoasQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_query) + "</pre></p>");
            out.println("<h2>Consulta 2.B: Quais os nomes das pessoas? Por meio de TypedQuery</h2>");
            pessoaBean.findAllPessoasTypedQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_typed_query) + "</pre></p>");
            out.println("<h2>Consulta 2.C: Quais os nomes das pessoas? Por meio de NameedQuery</h2>");
            pessoaBean.findAllPessoasNamedQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_named_query) + "</pre></p>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
