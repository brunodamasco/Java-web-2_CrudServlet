package br.com.crudservlet.controle;

import br.com.crudservlet.bean.Cliente;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
@WebServlet(name = "ClienteControle", urlPatterns = {"/cadCliente"})
public class ClienteServlet extends HttpServlet {
    private HttpServletRequest request;
    private HttpServletResponse response;
    private RequestDispatcher rd;
    private Cliente cliente;

    protected void processRequest()throws ServletException, IOException {
        String cmd = request.getParameter("cmd");
        switch(cmd){
            case "salvar":
                salvar();
                break;
        }
    }
    
    private void salvar() {
         cliente = new Cliente();
         cliente.setNome(request.getParameter("nome"));
         cliente.setCpf(request.getParameter("cpf"));
         cliente.setRg(request.getParameter("rg"));
         cliente.setEmail(request.getParameter("email"));
         cliente.setTelefone(request.getParameter("tel"));
         mostrarDados();
    }
    
    private void mostrarDados(){
        request.setAttribute("clienteJsp", cliente);
        request.setAttribute("msg", "funcionário salvo com sucesso!");
        rd = request.getRequestDispatcher("mostrarCliente.jsp");
    }
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.request = request;
        this.response = response;
        processRequest();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.request = request;
        this.response = response;
        processRequest();
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
