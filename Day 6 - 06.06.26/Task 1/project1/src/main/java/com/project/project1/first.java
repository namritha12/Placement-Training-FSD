package com.project.project1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class first {
    @GetMapping("/hello/{name}")
    public String sayhello(@PathVariable String name) {

        return "hello " + name;
    }

    @GetMapping("/name")

    public String sayName() {
        return "I am Namri dont disturb me";
    }

    @GetMapping("/age")
    public int sayAge() {
        return 20;
    }

    @GetMapping("/color")
    public String sayColor() {
        return "Blue";
    }

    @GetMapping("/calci/addition/{n1}/{n2}")
    public String add(@PathVariable int n1, @PathVariable int n2) {
        int sum = n1 + n2;
        return "Sum is " + sum;
    }

    @GetMapping("/calci/subtraction/{n1}/{n2}")
    public String sub(@PathVariable int n1, @PathVariable int n2) {
        int diff = n1 - n2;
        return "Difference is " + diff;
    }

    @GetMapping("/calci/multiplication/{n1}/{n2}")
    public String mul(@PathVariable int n1, @PathVariable int n2) {
        int prod = n1 * n2;
        return "product is " + prod;
    }

    @GetMapping("/calci/division/{n1}/{n2}")
    public String div(@PathVariable int n1, @PathVariable int n2) {
        int quo = n1 / n2;
        return "Quotient is " + quo;
    }

    @GetMapping("/calci/division1/{n1}/{n2}")
    public String div1(@PathVariable int n1, @PathVariable int n2) {
        int quo = n1 % n2;
        return "Remainder is " + quo;
    }

    @GetMapping("/calci/division2/{n1}/{n2}")
    public String cmp1(@PathVariable int n1, @PathVariable int n2) {
        if (n1 > n2) {
            return "greater one" + n1;
        } else {
            return "greater one" + n2;
        }
    }

    @GetMapping("/calci/sumoddeven/{n1}/{n2}")
    public String soddeven(@PathVariable int n1, @PathVariable int n2) {
        int sum = n1 + n2;
        if (sum % 2 == 0) {
            return "It is even" + sum;
        } else {
            return "It is odd" + sum;
        }
    }

    @GetMapping("/name/{name1}")
    public String check(@PathVariable String name1) {
        String n = name1.toLowerCase();
        if (n.equals("namri")) {
            return "It is my name";
        } else {
            return "I dont know";
        }
    }

    @GetMapping("/calci/primeornot/{n}")
    public String check(@PathVariable int n) {
        if (n <= 1) {
            return "It is NOT prime";
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return "It is NOT prime";
            }
        }
        return "It is PRIME";
    }

    @GetMapping("/climate/{n}")
    public String climate(@PathVariable int n) {
        if (n < 0) {
            return "Shivering";
        } else if (n > 0 && n <= 15) {
            return "chill";
        } else if (n > 15 && n <= 24) {
            return "happy";
        } else if (n > 24 && n <= 30) {
            return "Towards hot";
        } else if (n > 30 && n <= 32) {
            return "hotter";
        } else {
            return "omg";
        }
    }

    @GetMapping("/intro/{name}/{city}/{course}")
    public String introd(@PathVariable String name, @PathVariable String city, @PathVariable String course) {
        return "Hi , I am " + name + " from " + city + " Welcome to " + course;

    }

    @GetMapping("/calculator/{a}/{b}")
    public String cals(@PathVariable int a, @PathVariable int b) {
        StringBuilder sb = new StringBuilder();
        sb.append("add").append(a + b).append("\n");
        sb.append("sub").append(a - b).append("\n");
        sb.append("mult").append(a * b).append("\n");
        if (b != 0) {
            sb.append("quo").append(a / b).append("\n");
            sb.append("rem").append(a % b).append("\n");
        } else {
            sb.append(" quo Division by zero is not allowed\n");
            sb.append(" rem Division by zero is not allowed\n");
        }
        String x=sb.toString();
       // return "<pre>" + String x=sb.toString() + "</pre>"; //preserves formatting
        return x;
    }
}

