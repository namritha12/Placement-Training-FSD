package com.example.frontbackend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@CrossOrigin(origins = "*")


@RestController
public class CalciController {
   /* @GetMapping("/calc/add/{n1}/{n2}")
    public String addition(@PathVariable int n1, @PathVariable int n2) {
        int sum = n1 + n2;
        return "Sum is " + sum;
    }*/
   @GetMapping("/calc/add/{n1}/{n2}")
   public Map<String,Object> add(@PathVariable int n1, @PathVariable int n2){
       return Map.of("operation","addition","result",n1+n2);
   }

    @GetMapping("/calc/sub/{n1}/{n2}")
    public String subtraction(@PathVariable int n1, @PathVariable int n2) {
        int diff = n1 - n2;
        return "Diff is " + diff;
    }

    @GetMapping("/calc/logten/{n1}")
    public String lograthmic(@PathVariable int n1) {
        if (n1 <= 0) {
            return "Logarithm is not defined for zero or negative numbers";
        }
        double result = Math.log10(n1);
        return "Logarithm is " + String.format("%.2f", result);
    }

    @GetMapping("/calc/sinvalue/{n1}")
    public String sin(@PathVariable int n1) {
        double result = Math.sin(Math.toRadians(n1));
        return "Sin value is " + String.format("%.2f", result);
    }

    @GetMapping("/calc/cosvalue/{n1}")
    public String cos(@PathVariable int n1) {
        double result = Math.cos(Math.toRadians(n1));
        return "Cos value is " + String.format("%.2f", result);
    }

    @GetMapping("/calc/expo/{n1}")
    public String expo(@PathVariable int n1) {
        double result = Math.exp(n1);
        return "Exponential value is " + String.format("%.2f", result);
    }
    @GetMapping("/calc/spiral")
    public String spiral() {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        String result="";
        int left=0, top=0;
        int right=mat[0].length - 1;
        int bottom=mat.length - 1;
        while (top<=bottom && left<=right) {
            for (int i=left; i<=right;i++) {
                result+=mat[top][i] + " ";
            }
            top++;
            for (int i=top;i<=bottom;i++) {
                result+=mat[i][right] + " ";
            }
            right--;
            if (top <= bottom) {
                for (int i=right; i>=left; i--) {
                    result+=mat[bottom][i] + " ";
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result += mat[i][left] + " ";
                }
                left++;
            }
        }
        return "Spiral Matrix: " + result;
    }
}
