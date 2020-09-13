This is a simple web application flow example with spring boot

=============== Dependencies ======================

A web application contains following dependencies
            Spring - core, beans, context, aop
            Web MVC - (Spring MVC)
            Jackson - for JSON Data Binding
            Validation - Hibernate Validator, Validation API(javax.validation)
            Embedded Servlet Container - Tomcat 9.0
            Logging - logback, slf4j

- When we add spring-boot-starter-web dependency in the class path spring boot automatically add all the above dependencies that we needed to execute a web application.

It contains 
           - actuator dependecny to provide ops functionality like monitoring web app,auding,check state of DB,health of running application.
           - Dev Tools to pickup changes quickly and restart the server.
           - HAL Browser.
           
=========== path = src/main/webapp/WEB-INF/jsp/.jsp page =================
Configure View Resolver by adding
                                  spring.mvc.view.prefix=/WEB-INF/jsp/
                                  spring.mvc.view.suffix=.jsp
                                  inside application.properties file.
                                  
                                  
=========================================================================

By adding web starter dependency in the class path,Spring boot auto configure DispathcherServlet For application , that  acts as a FrontController.
That handles all incoming request and passes the req to coressponding Controller and controller class passes the request to handler mapping method 
that maps incoming web request with handler mapper method request, and pass response of handler mapping method to the dispather servlet ,then Disatcher servlet passes 
the response to the auto configured view resolver to search for the view page.

- By configuring the view page in properties file we basically tells Dispatcher servlet where to search for view page.
- @SpringBootApplication annotation automaically enable @EnableWebMvc by just adding web starter depencency in the class path.

=========================================================================

Apache Tomcat Sever starts at port -8081( configured in properties file)
HAL Browser Expose At - http://localhost:8081
Actuator Expose At -    http://localhost:8081/actuator


==========================================================================

To configure environment specific cnfiguration file we add 
                                                           spring.profiles.active=(dev,sit,uat,preprod,prd)  inside application.properties file or JVM Run Time evn. attribute(-Dspring.profiles.active=env)
                                                           
- To congfiure logback file outside of class path or inside class path for specific profiles we can use
                                                                                                       logging.config = src/main/resources/logback-env.xml
                                                           
                                  
           

            
