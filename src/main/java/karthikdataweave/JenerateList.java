package karthikdataweave;

import java.util.*;

import org.apache.commons.collections.map.HashedMap;

public class JenerateList {
	
	public List<Map<String, Object>> getListValues(String valueData){	
		List<Map<String, Object>> listValues = new ArrayList<Map<String, Object>>();
		@SuppressWarnings("unchecked")
		Map<String, Object> mapValue = new HashedMap();
		mapValue.put("name", valueData);
		listValues.add(mapValue);
		return listValues;
		
	}

}
