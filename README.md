"# Java_Web_Server" 




Description: To start the server on particular port, ServerSocket(int port) constructor is used. Once the actual socket is created on particular port we have to check for incoming requests on the initialized port continuously till the server is running . Client on entering the resource as String in web browser sends this request to the server which has to be parsed, so as to understand what response should be given back (eg: http://192.168.x.x:portNo/index.html). Implementation of web server is done at a very basic level as the core objective of this project was to understand how requests and responses are parsed in client-server architecture. Thus the code written will only work on static html 1.0 webpages. Interactive modern webpages will take a long amount of time to load thus rendering the server not much useful for html 2.0+ web pages. 




Technology: Java Socket Programming, Multithreading, Client-Server Architecture
Work link: https://www.youtube.com/watch?v=bhskF8Dl8Ns
