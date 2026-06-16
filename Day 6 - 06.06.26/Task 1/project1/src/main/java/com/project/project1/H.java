package com.project.project1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class H {
    @GetMapping("/myHtml")

    public String sayHello(){
        return """
             <html>
                      <head>
                          <style>
                              h1{
                                  background-color: bisque;
                              }
          
                              #p1{
                                  color:red;
                              }
          
                              .c1{
                                  font-size:50px;
                              }
          
                              *{
                                  font-family:"Blackadder ITC";
                              }
                          </style>
                      </head>
          
                      <body>
                          <h1 id='p1'>GREAT INDIAN PUPPY SALE</h1>
                          <h2>jolllyooo</h2>
                          <p class='c1'>sogammm</p>
          
                          <img src='https://images.pexels.com/photos/1108099/pexels-photo-1108099.jpeg'
                               width='250' height='250' alt='puppy'>
          
                          <img src='puppss.jfif'
                               width='250' height='250'>
                      </body>
                      </html>
                      """;

    }
}
