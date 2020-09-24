/**
 * 
 */
package com.fetchrewards;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * @author aikya
 *
 */
@Service
public class PyramidWordService {
	
	private static final Logger LOGGER = LogManager.getLogger(PyramidWordService.class);
	
	public boolean checkPyramidWord(String word) {
		
		word = word.replaceAll("\\s+","").toLowerCase().trim();		//removes white spaces
		Set<Integer> uniqueFrequencies = new HashSet<>();
		Map<Character, Integer> frequencyMap = new HashMap<>();
		
		for(char c : word.toCharArray()) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);	// determines unique characters in the supplied String
		}
		int uniqueCharsSize = frequencyMap.size();
		
		for(Map.Entry<Character, Integer> entry: frequencyMap.entrySet()) {
			uniqueFrequencies.add(entry.getValue());							// gets the unique character-frequencies of the supplied string
		}
		
		if(uniqueFrequencies.size() != uniqueCharsSize) {			// is 2 characters have the same frequency of occurrence, return false
			return false;
		}
		for(int i = 1; i <= uniqueCharsSize; i++) {
			if(!uniqueFrequencies.contains(i)) {
				return false;									// if any frequency is missing in the increasing sequence, return false
			}
		}
		LOGGER.info("The word {} is a pyramid word", word);
		return true;
	}

}
