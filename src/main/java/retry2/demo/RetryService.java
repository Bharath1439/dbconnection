package retry2.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetryService {


    @Autowired
    private RetryRepository retryRepository;
    public String getAll(){
        List<Retry> l=retryRepository.findAll();
        System.out.print(l);
        return "success";
    }
}
