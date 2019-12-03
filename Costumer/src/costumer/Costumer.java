package costumer;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import RMI.ComponentInterface;
import business.Component;

/**
 * Servlet implementation class Costumer
 */
@WebServlet("/Costumer")
public class Costumer extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Costumer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/customer.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				
				String nameComponent=request.getParameter("nameComponent");
				ComponentInterface stub=(ComponentInterface)Naming.lookup("rmi://localhost:1095/vendor");//lookup return a reference to the object 
				List<Component>cpts=stub.componentList();
				for(Component c:cpts)
				{
					if(c.getNameComponenet().equals(nameComponent))
					{ 	String message="Component is founded";
						request.setAttribute("name",c.getNameComponenet());//return a price component
						request.setAttribute("price",c.getPriceComponent());//return a name Component
						request.setAttribute("message",message);//return a message of availabity of comonent
					}
					else
					{
						String message="component not found";
						request.setAttribute("message",message);
					}
					
				}
				this.getServletContext().getRequestDispatcher("/WEB-INF/customer.jsp").forward(request,response);
				}catch (MalformedURLException | RemoteException | NotBoundException e) {
					e.printStackTrace();
			
			}
			
	}

}
