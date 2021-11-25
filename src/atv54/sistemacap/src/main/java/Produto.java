import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class Produto extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String nome = req.getParameter("nome");
        String parametroValor = req.getParameter("valor");
        String parametroIdCategoria = req.getParameter("idcategoria");
        
        if(parametroValor!= null){
            float valor = Float.parseFloat(parametroValor);
            int idCategoria = Integer.parseInt(parametroIdCategoria);
            out.printf("Modulo produto -- produto = %s, valor = %.2f, Id categoria = %d", nome, valor, idCategoria);
        }else{
            out.printf("Modulo produto -- produto = %s", nome);
        }
       
     
    }
    
}
