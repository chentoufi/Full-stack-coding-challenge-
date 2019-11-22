# Full-stack-coding-challenge-
Simple java/jee Project based on JAVA RMI principle 
A computer assembler looks for the availability and cost of the various components (hard disk, motherboard, RAM, ...etc) to assemble a computer.
the project consists of two parts:
- part server is called Vendor, which will define methods and implement them.(project java )
- the costumer part of which we will call server methods.(java jee project).
both parties are distributed.and the goal is to implement a simple and clear architecture based on middleware JAVA RMI.

Part server (Vendor ):
Server part consists of 3 layers:
- the business layer for which a computer component class will be defined.
- the RMI layer from which the interface containing the methods with their signatures will be defined. The class from which the methods of the interface will be implemented.
- the last layer containing the main method of which skelton is to be created in order to communicate with the costumer. 

Part costumer:
costumer Part consists of two Parties:
the first part containing the two layers of the server part:
- the business layer containing the computer component class.
- the second RMI layer containing only the interface.
the second part containing the servlet class for the purpose of managing the client view.


