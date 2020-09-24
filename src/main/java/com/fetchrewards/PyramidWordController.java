/**
 * 
 */
package com.fetchrewards;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aikya
 *
 */
@RestController
@RequestMapping("/pyramid")
public class PyramidWordController {
	
	
    private static final Logger LOGGER = LogManager.getLogger(PyramidWordController.class);
    
    @Autowired
    private PyramidWordService pyramidService;

    public PyramidWordController(PyramidWordService pyramidWordService) {
        this.pyramidService = pyramidWordService;
    }
	
	@RequestMapping("/{word}")
	public boolean isPyramidWord(@PathVariable("word") String word){
		System.out.println("Code reached here");
		boolean isPyramid = pyramidService.checkPyramidWord(word);
		LOGGER.info("Service class returned {} for the word: {}",isPyramid, word);
		
		return isPyramid;
	}
	
	@RequestMapping("/")
	public String isPyramidWord() {
		LOGGER.info("Word not supplied");		
		return "Please append your word in the path after /pyramid. White spaces will be removed";
	}
}
