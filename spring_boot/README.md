DispatcherServlet: takes the request and acts as a front controller that comunicates with the controllers

controllers: processes the request and fetches any data from the data base if its needed, the sends it back
to the DispatcherServlet wich fowards it to the ViewResolver

ViewResolver: renders the view based on the data and the view name and sends it to the client
