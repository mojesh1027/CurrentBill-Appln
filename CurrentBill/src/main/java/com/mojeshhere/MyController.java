package com.mojeshhere;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
	public class MyController {
	
	@RequestMapping("/")
	public String votepage() {
		
		return "bill";
		
	}		
		@RequestMapping("/req1")
		public String ItemNumber(@RequestParam int id,@RequestParam String name,
				@RequestParam double cr,@RequestParam double pr,ModelMap m) {
			
			double units=cr-pr,Totalbill=0.0;
			if(units<200) {
				Totalbill=units*1.75/100;
			}
			else if(units>200&&units<500) {
				Totalbill=units*3.75/100;
			}
			else {
				Totalbill=units*7.25/100;
			}
			m.put("k1",id);
			m.put("k2",name);
			m.put("k3",cr);
			m.put("k4",pr);
			m.put("k5",units);
			m.put("k6",Totalbill);
		return "result";
		}
		
}



