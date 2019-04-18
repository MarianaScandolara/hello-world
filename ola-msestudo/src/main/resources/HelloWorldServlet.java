@WebServlet("/HelloWorld")                                           
public class HelloWorldServlet extends HttpServlet {

   static String PAGE_HEADER =
       "<html><head><title>helloworld</title></head><body>";                

   static String PAGE_FOOTER = "</body></html>";

   @Inject
   HelloService helloService;                                        

   @Override
   protected void doGet(HttpServletRequest req,
                        HttpServletResponse resp)
                        throws ServletException, IOException {
      resp.setContentType("text/html");
      PrintWriter writer = resp.getWriter();
      writer.println(PAGE_HEADER);
      writer.println("<h1>" +
                     helloService.createHelloMessage("World") +      
                     "</h1>");
      writer.println(PAGE_FOOTER);
      writer.close();
   }
