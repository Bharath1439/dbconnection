package retry2.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {




    @Autowired
    private RetryService retryService;

    @GetMapping("getdata")
    public ResponseEntity<String> getAll(){
        String ans=retryService.getAll();
        return new ResponseEntity<>(ans, HttpStatus.OK);
    }
}
