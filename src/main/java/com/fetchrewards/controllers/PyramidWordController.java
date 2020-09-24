/**
 * 
 */
package com.fetchrewards.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fetchrewards.service.PyramidWordService;

/**
 * @author aikya
 *
 */
@RestController
@RequestMapping("/pyramid")
public class PyramidWordController {
	
	
    private static final Logger LOGGER = LogManager.getLogger(PyramidWordController.class);
    private PyramidWordService pyramidService;

    public PyramidWordController(PyramidWordService pyramidWordService) {
        this.pyramidService = pyramidWordService;
    }
	
	@RequestMapping("/{word}")
	public boolean isPyramidWord(@PathVariable String word) {
		
		boolean isPyramid = pyramidService.checkPyramidWord(word);
		LOGGER.info("Service class returned {} for the word: {}",isPyramid, word);
		
		return isPyramid;
	}
}
