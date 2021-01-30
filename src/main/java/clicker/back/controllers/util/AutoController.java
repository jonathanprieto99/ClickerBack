package clicker.back.controllers.util;

import clicker.back.Setup;
import clicker.back.entities.Auto;
import clicker.back.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/auto")
@CrossOrigin(origins = {Setup.local/*,Setup.route*/}, allowedHeaders = "*")
public class AutoController {
    @Autowired
    AutoService autoService;

    @PostMapping
    @ResponseBody
    public ResponseEntity<Object> save(@RequestBody Auto auto){
        try{
            return new ResponseEntity<>(autoService.save(auto), HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>("fallo",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping(value = "/count")
    @ResponseBody
    public ResponseEntity<Object> countByMarca(){
        try{
            return new ResponseEntity<>(autoService.getCountMarca(),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("fallo", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
