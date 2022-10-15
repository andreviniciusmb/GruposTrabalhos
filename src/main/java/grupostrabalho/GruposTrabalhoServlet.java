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
            
            
            out.println("<h2>1.A: Quais as pessoas (dados completos) cadastradas? Por meio de Query</h2>");
            //List<Pessoa> lst_pessoas_query = pessoaBean.findAllPessoasQuery();
            //out.println("<p><pre>" + Util.toJson(lst_pessoas_query) + "</pre></p>");
            out.println("<h2>1.B: Quais as pessoas (dados completos) cadastradas? Por meio de TypedQuery</h2>");
            List<Pessoa> lst_pessoas_typed_query = pessoaBean.findAllPessoasTypedQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_typed_query) + "</pre></p>");
            out.println("<h2>1.C: Quais as pessoas (dados completos) cadastradas? Por meio de NameedQuery</h2>");
            List<Pessoa> lst_pessoas_named_query = pessoaBean.findAllPessoasNamedQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_named_query) + "</pre></p>");
            
            out.println("<h2>2.A: Quais os nomes das pessoas? Por meio de Query</h2>");
            List<Pessoa> lst_pessoas_query = pessoaBean.findNomeQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_query) + "</pre></p>");
            out.println("<h2>2.B: Quais os nomes das pessoas? Por meio de TypedQuery</h2>");
            out.println("<p><pre>" + Util.toJson(pessoaBean.findNomeTypedQuery()) + "</pre></p>");
            out.println("<h2>2.C: Quais os nomes das pessoas? Por meio de NameedQuery</h2>");
            lst_pessoas_named_query = pessoaBean.findNomeNamedQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_named_query) + "</pre></p>");
            
            out.println("<h2>3.A: Quais as pessoas (nome) e seus respectivos endereços (dados completos)? Por meio de Query</h2>");
            lst_pessoas_query = pessoaBean.findNomePessoaEnderecoQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_query) + "</pre></p>");
            out.println("<h2>3.B: Quais as pessoas (nome) e seus respectivos endereços (dados completos)? Por meio de TypedQuery</h2>");
            out.println("<p><pre>" + Util.toJson(pessoaBean.findNomePessoaEnderecoTypedQuery()) + "</pre></p>");
            out.println("<h2>3.C: Quais as pessoas (nome) e seus respectivos endereços (dados completos)? Por meio de NameedQuery</h2>");
            lst_pessoas_named_query = pessoaBean.findNomePessoaEnderecoNamedQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_named_query) + "</pre></p>");
            
            out.println("<h2>4.A: Quais pessoas (dados completos) moram em avenidas? Por meio de Query</h2>");
            lst_pessoas_query = pessoaBean.findPessoasAvenidaQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_query) + "</pre></p>");
            out.println("<h2>4.B: Quais pessoas (dados completos) moram em avenidas? Por meio de TypedQuery</h2>");
            lst_pessoas_typed_query = pessoaBean.findPessoasAvenidaTypedQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_typed_query) + "</pre></p>");
            out.println("<h2>4.C: Quais pessoas (dados completos) moram em avenidas? Por meio de NameedQuery</h2>");
            lst_pessoas_named_query = pessoaBean.findPessoasAvenidaNamedQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_named_query) + "</pre></p>");
            
            out.println("<h2>5.A: Quais pessoas (dados completos) não moram em praças? Por meio de Query</h2>");
            lst_pessoas_query = pessoaBean.findPessoasNaoPracaQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_query) + "</pre></p>");
            out.println("<h2>5.B: Quais pessoas (dados completos) não moram em praças? Por meio de TypedQuery</h2>");
            lst_pessoas_typed_query = pessoaBean.findPessoasNaoPracaTypedQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_typed_query) + "</pre></p>");
            out.println("<h2>5.C: Quais pessoas (dados completos) não moram em praças? Por meio de NameedQuery</h2>");
            lst_pessoas_named_query = pessoaBean.findPessoasNaoPracaNamedQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_named_query) + "</pre></p>");
            
            out.println("<h2>6.A: Quais pessoas (nomes) e seus respectivos telefones (dados completos)? Por meio de Query</h2>");
            lst_pessoas_query = pessoaBean.findNomeTelefoneQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_query) + "</pre></p>");
            out.println("<h2>6.B: Quais pessoas (nomes) e seus respectivos telefones (dados completos)? Por meio de TypedQuery</h2>");
            lst_pessoas_typed_query = pessoaBean.findPessoasNaoPracaTypedQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_typed_query) + "</pre></p>");
            out.println("<h2>6.C: Quais pessoas (nomes) e seus respectivos telefones (dados completos)? Por meio de NameedQuery</h2>");
            lst_pessoas_named_query = pessoaBean.findPessoasNaoPracaNamedQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_named_query) + "</pre></p>");
            
            out.println("<h2>7.A: Quais as pessoas (dados completos) que nasceram entre abril de 2001 "
                    + "e abril de 2004? a) Elaborar método para receber quaisquer datas a serem pesquisados "
                    + "ao contrário de fixá-las na JPQL b) Tal método pode ter variados formatos: receber um short "
                    + "para o ano e um byte para o mês, ou uma enumeração para o mês; a data inicial e a data final "
                    + "completas; e outras.</h2>");
            lst_pessoas_query = pessoaBean.findNomeTelefoneQuery();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_query) + "</pre></p>");

            out.println("<h2>8.A: Quais pessoas (dados completos) têm telefone do estado do Paraná?</h2>");
            lst_pessoas_query = pessoaBean.findPessoasPR();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_query) + "</pre></p>");
            out.println("<h2>8.B: Quais pessoas (dados completos) têm telefone do estado do Rio de Janeiro?</h2>");
            lst_pessoas_typed_query = pessoaBean.findPessoasRJ();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_typed_query) + "</pre></p>");
            
            out.println("<h2>9.A: Quais pessoas (dados completos) não possuem telefone?</h2>");
            lst_pessoas_query = pessoaBean.findPessoasNaoTelefone();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_query) + "</pre></p>");
            
            out.println("<h2>10.A:  Quantos telefones cada pessoa (nome) tem?</h2>");
            lst_pessoas_query = pessoaBean.findTelefonePorPessoa();
            out.println("<p><pre>" + Util.toJson(lst_pessoas_query) + "</pre></p>");
            
            out.println("<h2>11.A:  Quais grupos (dados completos) não estão ativos?</h2>");
            out.println("<p><pre>" + Util.toJson(grupoBean.findGruposNaoAtivos()) + "</pre></p>");
            
            out.println("<h2>12.A:  Quais são os líderes (nomes) dos grupos (nomes)?</h2>");
            out.println("<p><pre>" + Util.toJson(grupoBean.findLideres()) + "</pre></p>");
            
            out.println("<h2>13.A:  Quais são os membros (nomes) do grupo com nome “Estudo IV” com "
                    + "ordenação alfabética inversa?</h2>");
            String nome_grupo = "Estudo IV";
            out.println("<p><pre>" + Util.toJson(grupoBean.findGrupoOrdenado(nome_grupo)) + "</pre></p>");
            
            out.println("<h2>14.  Quais são os grupos (dados completos) liderados por “Beatriz Yana”?</h2>");
            String nome_lider = "Beatriz Yana";
            out.println("<p><pre>" + Util.toJson(grupoBean.findGruposLider(nome_lider)) + "</pre></p>");
            
            
            out.println("<h2>15.  Quais são as datas de início e de término da atuação "
                    + "e os grupos (nomes) nos quais “Cecília Xerxes” é membro?</h2>");
            String nome_membro = "Cecília Xerxes";
            out.println("<p><pre>" + Util.toJson(grupoBean.findAtuacaoMembro(nome_membro)) + "</pre></p>");
            
            out.println("<h2>16.  Quais são os grupos (dados completos) que contêm “II” em seus nomes?</h2>");
            String trecho_estudo = "II";
            out.println("<p><pre>" + Util.toJson(grupoBean.findGruposTrecho(trecho_estudo)) + "</pre></p>");
            
            out.println("<h2>17.  Quais são os grupos (nomes) e os respectivos totais de membros distintos já alocados?</h2>");
            out.println("<p><pre>" + Util.toJson(grupoBean.findGruposQtdMembros()) + "</pre></p>");
            
            out.println("<h2>18.  Quais grupos (nomes) têm 3 ou mais atuações de membros e quanto são esses totais de atuações?</h2>");
            Integer totalAtuacoes = 3;
            out.println("<p><pre>" + Util.toJson(grupoBean.findGruposQtdAtuacoes(totalAtuacoes)) + "</pre></p>");
            
            out.println("<h2>19.  Quais membros (nomes) entraram a partir de 2012 no primeiro grupo?</h2>");
            Integer ano = 2012;
            String grupo = "Estudo I";
            out.println("<p><pre>" + Util.toJson(grupoBean.findMembrosAnoGrupo(ano, grupo)) + "</pre></p>");

            // TODO Questao 20
            
            out.println("<h2>21:  Quais os grupos (nomes) e respectivos membros (nomes) que não possuem "
                    + "data de término de atuação em seus grupos?</h2>");
            out.println("<p><pre>" + Util.toJson(grupoBean.findMembrosGruposSemTermino()) + "</pre></p>");
            
            out.println("<h2>22.  Quais são os grupos (nomes) e líderes (nomes) com respectivos membros (nomes)? Ordenação por nome de grupo</h2>");
            out.println("<p><pre>" + Util.toJson(grupoBean.findAllGruposOrderGrupo()) + "</pre></p>");
            
            out.println("<h2>22.  Quais são os grupos (nomes) e líderes (nomes) com respectivos membros (nomes)? Ordenação por nome de liders</h2>");
            out.println("<p><pre>" + Util.toJson(grupoBean.findAllGruposOrderLider()) + "</pre></p>");
            
            out.println("<h2>22.  Quais são os grupos (nomes) e líderes (nomes) com respectivos membros (nomes)? Ordenação por nome de membro</h2>");
            out.println("<p><pre>" + Util.toJson(grupoBean.findAllGruposOrderMembro()) + "</pre></p>");
            
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
